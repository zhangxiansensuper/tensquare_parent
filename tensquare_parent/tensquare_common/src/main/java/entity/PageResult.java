package entity;

import java.util.List;

/**
 * 分页结果类
 * @Author zhang
 * @Date 2020/5/1 17:49
 * @Version 1.0
 */
public class PageResult<T> {

    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
