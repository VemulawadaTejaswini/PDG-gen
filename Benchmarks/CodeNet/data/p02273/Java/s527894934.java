import java.util.Scanner;

class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("%.8f %.8f", x, y);
	}

}

public class Main {



	public static void main(String[] args) {

		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(100.0, 0.0);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println(p1);
		koch(n, p1, p2);
		System.out.println(p2);

	}

	private static void koch(int n, Point a, Point b) {
		if (n == 0) return;

		Point s, t, u;
		double th = 60.0/180.0 * Math.PI;	// radian60'C

		s = new Point(
				(2.0 * a.getX() + 1.0 * b.getX()) / 3.0,
				(2.0 * a.getY() + 1.0 * b.getY()) / 3.0 );
		t = new Point(
				(1.0 * a.getX() + 2.0 * b.getX()) / 3.0,
				(1.0 * a.getY() + 2.0 * b.getY()) / 3.0 );
		u = new Point(
				(t.getX() - s.getX())*Math.cos(th) - (t.getY() - s.getY())*Math.sin(th) + s.getX(),
				(t.getX() - s.getX())*Math.sin(th) + (t.getY() - s.getY())*Math.cos(th) + s.getY() );

		koch(n-1, a, s);
		System.out.println(s);
		koch(n-1, s, u);
		System.out.println(u);
		koch(n-1, u, t);
		System.out.println(t);
		koch(n-1, t, b);

	}
}