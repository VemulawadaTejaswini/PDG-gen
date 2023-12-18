import java.util.Scanner;

class Circle {
	private double x;
	private double y;
	private double r;

	Circle(double x, double y, double r) {
		setX(x);
		setY(y);
		setR(r);
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getR() {
		return r;
	}

}

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = (int)sc.nextDouble();

		for (int i = 0; i < n; i++) {
			Circle c0 = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			Circle c1 = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

			c_Intersection(c0, c1);
		}

	}

	private static void c_Intersection(Circle c0, Circle c1) {
		double d = Math.pow(c0.getX() - c1.getX(), 2) + Math.pow(c0.getY() - c1.getY(), 2);

		if (d < Math.pow(c0.getR() - c1.getR(), 2)) {

			if (c0.getR() >= c1.getR()) {
				System.out.println(2);
			} else {
				System.out.println(-2);
			}

		} else if ( d <= Math.pow(c0.getR() + c1.getR(), 2)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
