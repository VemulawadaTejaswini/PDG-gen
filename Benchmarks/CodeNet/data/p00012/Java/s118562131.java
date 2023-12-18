import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Point2D.Double p1, p2, p3, x;
		boolean flag;

		while (sc.hasNext()) {
			p1 = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			p2 = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			p3 = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			x  = new Point2D.Double(sc.nextDouble(), sc.nextDouble());

			if (f(p1, p2, p3, x)) {
				
			}

			if (f(p1, p2, p3, x) && f(p2, p3, p1, x) && f(p3, p1, p2, x)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static boolean f(Point2D.Double a, Point2D.Double b, Point2D.Double c, Point2D.Double x) {
		double s, i;

		if (a.x - b.x == 0) {
			if (0 < (x.x - a.x) * (c.x - a.x)) {
				return true;
			} else {
				return false;
			}
		} else {
			s = (b.y - a.y) / (b.x - a.x);
			i = a.y - s * a.x;
			if (0 < (x.y - (s * x.x + i)) * (c.y - (s * c.x + i))) {
				return true;
			} else {
				return false;
			}
		}
	}
}