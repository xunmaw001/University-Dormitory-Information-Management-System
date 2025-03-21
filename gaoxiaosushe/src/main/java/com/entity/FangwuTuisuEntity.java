package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 公寓退宿申请
 *
 * @author 
 * @email
 */
@TableName("fangwu_tuisu")
public class FangwuTuisuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangwuTuisuEntity() {

	}

	public FangwuTuisuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 退宿编号
     */
    @ColumnInfo(comment="退宿编号",type="varchar(200)")
    @TableField(value = "fangwu_tuisu_uuid_number")

    private String fangwuTuisuUuidNumber;


    /**
     * 公寓
     */
    @ColumnInfo(comment="公寓",type="int(11)")
    @TableField(value = "fangwu_id")

    private Integer fangwuId;


    /**
     * 学生
     */
    @ColumnInfo(comment="学生",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请理由
     */
    @ColumnInfo(comment="申请理由",type="longtext")
    @TableField(value = "fangwu_tuisu_text")

    private String fangwuTuisuText;


    /**
     * 申请退宿时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请退宿时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "fangwu_tuisu_yesno_types")

    private Integer fangwuTuisuYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="longtext")
    @TableField(value = "fangwu_tuisu_yesno_text")

    private String fangwuTuisuYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "fangwu_tuisu_shenhe_time")

    private Date fangwuTuisuShenheTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：退宿编号
	 */
    public String getFangwuTuisuUuidNumber() {
        return fangwuTuisuUuidNumber;
    }
    /**
	 * 设置：退宿编号
	 */

    public void setFangwuTuisuUuidNumber(String fangwuTuisuUuidNumber) {
        this.fangwuTuisuUuidNumber = fangwuTuisuUuidNumber;
    }
    /**
	 * 获取：公寓
	 */
    public Integer getFangwuId() {
        return fangwuId;
    }
    /**
	 * 设置：公寓
	 */

    public void setFangwuId(Integer fangwuId) {
        this.fangwuId = fangwuId;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请理由
	 */
    public String getFangwuTuisuText() {
        return fangwuTuisuText;
    }
    /**
	 * 设置：申请理由
	 */

    public void setFangwuTuisuText(String fangwuTuisuText) {
        this.fangwuTuisuText = fangwuTuisuText;
    }
    /**
	 * 获取：申请退宿时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：申请退宿时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getFangwuTuisuYesnoTypes() {
        return fangwuTuisuYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setFangwuTuisuYesnoTypes(Integer fangwuTuisuYesnoTypes) {
        this.fangwuTuisuYesnoTypes = fangwuTuisuYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getFangwuTuisuYesnoText() {
        return fangwuTuisuYesnoText;
    }
    /**
	 * 设置：审核回复
	 */

    public void setFangwuTuisuYesnoText(String fangwuTuisuYesnoText) {
        this.fangwuTuisuYesnoText = fangwuTuisuYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getFangwuTuisuShenheTime() {
        return fangwuTuisuShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setFangwuTuisuShenheTime(Date fangwuTuisuShenheTime) {
        this.fangwuTuisuShenheTime = fangwuTuisuShenheTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FangwuTuisu{" +
            ", id=" + id +
            ", fangwuTuisuUuidNumber=" + fangwuTuisuUuidNumber +
            ", fangwuId=" + fangwuId +
            ", yonghuId=" + yonghuId +
            ", fangwuTuisuText=" + fangwuTuisuText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", fangwuTuisuYesnoTypes=" + fangwuTuisuYesnoTypes +
            ", fangwuTuisuYesnoText=" + fangwuTuisuYesnoText +
            ", fangwuTuisuShenheTime=" + DateUtil.convertString(fangwuTuisuShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
