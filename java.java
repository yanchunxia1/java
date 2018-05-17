package com.atguigu.maven.bean;

public class Employee {
	private Integer id111;
	private String name222222;
	private String email;
	private Integer salary;
	private Department dept;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}
	public Employee(Integer id, String name, String email, Integer salary, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
