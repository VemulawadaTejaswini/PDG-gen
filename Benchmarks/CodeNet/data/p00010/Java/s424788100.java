import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Point2D.Double a, b, c;
		Point2D.Double middle1, middle2;
		double slope1, slope2;
		Point2D.Double solve;
		double r;

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			b = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			c = new Point2D.Double(sc.nextDouble(), sc.nextDouble());

			middle1 = new Point2D.Double((a.x + b.x) / 2.0, (a.y + b.y) / 2.0);
			middle2 = new Point2D.Double((b.x + c.x) / 2.0, (b.y + c.y) / 2.0);
			slope1 = getSlope(a, b);
			slope2 = getSlope(b, c);
			solve = makeSolution(middle1, slope1, middle2, slope2);
			r = Math.sqrt((solve.x - a.x) * (solve.x - a.x) + (solve.y - a.y) * (solve.y - a.y));
			System.out.printf("%.3f %.3f %.3f", solve.x, solve.y, r);
		}
	}

	public static double getSlope(Point2D.Double a, Point2D.Double b) {
		if (a.y == b.y) {
			return Double.POSITIVE_INFINITY;
		}
		return (b.x - a.x) / (b.y - a.y);
	}

	public static Point2D.Double makeSolution (Point2D.Double p1, double e1, Point2D.Double p2, double e2) {
		double a, b, c, d;
		double x = 0, y = 0;

		a = e1;
		if (!Double.isInfinite(a)) {
			b = p1.y - a * p1.x;
		} else {
			b = Double.NaN;
		}
		c = e2;
		if (!Double.isInfinite(c)) {
			d = p2.y - c * p2.x;
		} else {
			d = Double.NaN;
		}

		if (!Double.isNaN(b) && !Double.isNaN(d)) {
			x = (d - b) / (a - c);
			y = (a * d - b * c) / (a - c);
		} else if (Double.isNaN(b)) {
			x = p1.x;
			y = c * x + d;
		} else if (Double.isNaN(d)) {
			x = p2.x;
			y = a * x + b;
		}

		return new Point2D.Double(x, y);
	}
}