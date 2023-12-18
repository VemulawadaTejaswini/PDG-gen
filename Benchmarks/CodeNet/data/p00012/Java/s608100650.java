import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			Point p1 = new Point( sc.nextDouble(), sc.nextDouble() );
			Point p2 = new Point( sc.nextDouble(), sc.nextDouble() );
			Point p3 = new Point( sc.nextDouble(), sc.nextDouble() );
			Point p = new Point( sc.nextDouble(), sc.nextDouble() );

			Line l1 = new Line(p1, p2);
			Line l2 = new Line(p2, p3);
			Line l3 = new Line(p3, p1);

			if (issameside(p, p1, l2)
					&& issameside(p, p2, l3)
					&& issameside(p, p3, l1)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static class Point {
		double x;
		double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	public static class Line {
		Point p1; // (p1.x, p1.y)
		Point p2; // (p2.x, p2.y)

		public Line(Point p1, Point p2) {
			this.p1 = p1;
			this.p2 = p2;
		}
	}

	private static boolean isvertical(Line l) {
		if (l.p1.x == l.p2.x) return true;
		else return false;
	}

	private static double gety(Line l, double x) {
		if (isvertical(l)) return 0;
		double a = (l.p2.y - l.p1.y)/(l.p2.x - l.p1.x);
		double b = l.p1.y - a * l.p1.x;
		return a*x + b;
	}

	public static boolean issameside(Point a, Point p, Line l) {
		//  l.p1 = (l.p1.x, l.p1.y) ??¨ l.p2 = (l.p2.x, l.p2.y) ???????????´??? l ??????
		//  y - p1.y = (p2.y - p1.y)/(p2.x - p1.x) * (x - p1.x)
		if (isvertical(l)) {
			if (a.x < l.p1.x && p.x < l.p1.x) return true;
			else if (l.p1.x < a.x && l.p1.x < p.x) return true;
			else return false;
		}

		if (a.y < gety(l, a.x) && p.y < gety(l, p.x)) return true;
		else if (gety(l, a.x) < a.y && gety(l, p.x) < p.y) return true;
		else return false;
	}
}