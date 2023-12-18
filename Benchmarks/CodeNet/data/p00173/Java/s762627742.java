import java.util.ArrayList;
import java.util.Scanner;


class Class_Visitor {
	private String class_name;
	private int visitor_am;
	private int visitor_pm;

	Class_Visitor(String class_name, int visitor_am, int visitor_pm){
		setClass_name(class_name);
		setVisitor_am(visitor_am);
		setVisitor_pm(visitor_pm);
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public void setVisitor_am(int visitor_am) {
		this.visitor_am = visitor_am;
	}

	public void setVisitor_pm(int visitor_pm) {
		this.visitor_pm = visitor_pm;
	}

	public String getClass_name() {
		return class_name;
	}
	public int getVisitor_am() {
		return visitor_am;
	}
	public int getVisitor_pm() {
		return visitor_pm;
	}
}

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Class_Visitor> vis = new ArrayList<Class_Visitor>();

		for (int i = 0; i < 9; i++) {
			String[] data = sc.nextLine().split(" ");
			Class_Visitor c_v = new Class_Visitor(data[0], Integer.parseInt(data[1]),
												   Integer.parseInt(data[2]));
			vis.add(c_v);

			String c_name = vis.get(i).getClass_name();
			int v_sum = vis.get(i).getVisitor_am() + vis.get(i).getVisitor_pm();
			int f_sum = 200 * vis.get(i).getVisitor_am() + 300 * vis.get(i).getVisitor_pm();

			System.out.printf("%s %d %d\n",c_name ,v_sum ,f_sum);
		}

	}

}

