import java.util.Scanner;

class Point {
	double x;
	double y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		 System.out.printf("%.8f %.8f%n", this.x, this.y);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point p1 = new Point(0, 0);
		Point p2 = new Point(100, 0);
		p1.print();
		Koch(n, p1, p2);
		p2.print();
	}

	public static void Koch(int n, Point p1, Point p2) {
		if (n == 0) {
			return;
		}
		Point s = new Point((p1.x * 2.0 + p2.x * 1.0) / 3.0, (p1.y * 2.0 + p2.y * 1.0) / 3.0);
		Point t = new Point((p1.x * 1.0 + p2.x * 2.0) / 3.0, (p1.y * 1.0 + p2.y * 2.0) / 3.0);
		Point u = new Point((t.x - s.x) * 0.5 - (t.y - s.y) * Math.sqrt(3.0) *0.5 + s.x,
			             	(t.x - s.x) * Math.sqrt(3.0) *0.5 + (t.y - s.y) * 0.5 + s.y);

		Koch(n - 1, p1, s);
		s.print();
		Koch(n - 1, s, u);
		u.print();
		Koch(n - 1, u, t);
		t.print();
		Koch(n - 1, t, p2);
	}
}
