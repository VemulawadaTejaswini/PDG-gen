import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Segments/Lines - Parallel/Orthogonal
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		String[] words;

		while ((line = sc.nextLine()) != null && !line.isEmpty()) {

			int q = parseInt(line);

			for (int i = 0; i < q; i++) {
				double xp0 = sc.nextDouble();
				double yp0 = sc.nextDouble();
				double xp1 = sc.nextDouble();
				double yp1 = sc.nextDouble();
				double xp2 = sc.nextDouble();
				double yp2 = sc.nextDouble();
				double xp3 = sc.nextDouble();
				double yp3 = sc.nextDouble();
				sc.nextLine();

				Segment s1 = new Segment(new Point(xp0, yp0), new Point(xp1, yp1));
				Segment s2 = new Segment(new Point(xp2, yp2), new Point(xp3, yp3));

				boolean parallel = Geometries.isParallel(s1, s2);
				boolean orthogonal = Geometries.isOrthogonal(s1, s2);

				if (parallel) {
					System.out.println(2);
				} else if (orthogonal) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		} //end while
	} //end main
}

class Geometries {

	static double EPS = 1e-10;

	//
	static boolean equals(double a, double b) {
		return Math.abs(a - b) < EPS;
	}

	//??´?????????
	static boolean isOrthogonal(Point a, Point b) {
		return equals(a.inner(b), 0.0);
	}

	static boolean isOrthogonal(Point a1, Point a2, Point b1, Point b2) {
		return isOrthogonal(
				a1.subtract(a2),
				b1.subtract(b2)
		);
	}

	static boolean isOrthogonal(Segment s1, Segment s2) {
		return isOrthogonal(
				s1.p2.subtract(s1.p1),
				s2.p2.subtract(s2.p1)
		);
	}

	//????????????
	static boolean isParallel(Point a, Point b) {
		return equals(a.outer(b), 0.0);
	}

	static boolean isParallel(Point a1, Point a2, Point b1, Point b2) {
		return isParallel(
				a1.subtract(a2),
				b1.subtract(b2)
		);
	}

	static boolean isParallel(Segment s1, Segment s2) {
		return isParallel(
				s1.p2.subtract(s1.p1),
				s2.p2.subtract(s2.p1)
		);
	}
}

class Point implements Comparable<Point> {

	static double EPS = 1e-10;

	double x, y;

	Point() {
		this(0.0, 0.0);
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point p) {
		if (equals(p)) {
			return 0;
		} else {
			if (x != p.x) {
				return Double.compare(y, p.y);
			} else {
				return Double.compare(x, p.x);
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return x - p.x < EPS && y - p.y < EPS;
	}

	Point add(Point p) {
		return (Point) new Point(x + p.x, y + p.y);
	}

	Point subtract(Point p) {
		return (Point) new Point(x - p.x, y - p.y);
	}

	Point multiply(double k) {
		return (Point) new Point(x * k, y * k);
	}

	Point devide(double k) {
		return (Point) new Point(x / k, y / k);
	}

	double inner(Point p) {
		return x * p.x + y * p.y;
	}

	double outer(Point p) {
		return x * p.y - y * p.x;
	}

	double norm() {
		return x * x + y * y;
	}

	double abs() {
		return Math.sqrt(norm());
	}
}

class Segment {
	Point p1, p2;

	public Segment() {
		this(new Point(), new Point());
	}

	public Segment(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
}

class Circle {
	Point c;
	double r;

	public Circle() {
		this(new Point(), 0.0);
	}

	public Circle(Point c, double r) {
		this.c = c;
		this.r = r;
	}
}