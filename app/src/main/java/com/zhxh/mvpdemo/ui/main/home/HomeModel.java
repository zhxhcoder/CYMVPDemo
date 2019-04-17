package com.zhxh.mvpdemo.ui.main.home;

import com.zhxh.corelibs.mvp.BaseModel;
import com.zhxh.corelibs.net.BaseHttpResult;
import com.hazz.example.data.entity.TestNews;
import com.hazz.example.data.repository.RetrofitUtils;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author xuhao
 * @date 2018/6/13 15:35
 * @desc
 */
public class HomeModel extends BaseModel implements HomeContract.Model {
    @Override
    public Observable<BaseHttpResult<List<TestNews>>> getGankData() {
        return RetrofitUtils.getHttpService().getGankData();
    }
}
