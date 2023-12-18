
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		loop: while (true) {
			Point2D.Double[] points = new Point2D.Double[4];
			int maxx = Integer.MIN_VALUE;
			int maxy = Integer.MIN_VALUE;
			int minx = Integer.MAX_VALUE;
			int miny = Integer.MAX_VALUE;
			for (int i = 0; i < 4; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				if (i == 0 && x == 0 && y == 0) {
					break loop;
				}
				points[i] = new Point2D.Double(x, y);
				if (i != 3) {
					maxx = Math.max(maxx, x);
					maxy = Math.max(maxy, y);
					minx = Math.min(minx, x);
					miny = Math.min(miny, y);
				}
			}
			double r = scanner.nextDouble();
			Line2D.Double a = new Line2D.Double(points[1], points[2]);
			Line2D.Double b = new Line2D.Double(points[2], points[0]);
			Line2D.Double c = new Line2D.Double(points[0], points[1]);
			Ellipse2D.Double circle = new Ellipse2D.Double(points[3].x,
					points[3].y, r * 2, r * 2);
			double d0 = points[3].distance(points[0]);
			double d1 = points[3].distance(points[1]);
			double d2 = points[3].distance(points[2]);
			double ap = a.ptSegDist(points[3]);
			double bp = b.ptSegDist(points[3]);
			double cp = c.ptSegDist(points[3]);

			if (d0 <= r && d1 <= r && d2 <= r) {
				System.out.println("b");
			} else if (ap >= r && bp >= r && cp >= r) {
				Line2D.Double da = new Line2D.Double(points[0], points[3]);
				Line2D.Double db = new Line2D.Double(points[1], points[3]);
				Line2D.Double dc = new Line2D.Double(points[2], points[3]);
				double x3 = points[3].x;
				double y3 = points[3].y;
				if (minx < x3 && x3 < maxx && miny < y3 && y3 < maxy
						&& !a.intersectsLine(da) && !b.intersectsLine(db)
						&& !c.intersectsLine(dc)) {
					System.out.println("a");
				} else {
					if (ap == r || bp == r || cp == r) {
						System.out.println("c");
					} else {
						System.out.println("d");
					}
				}
			} else {
				System.out.println("c");
			}

		}
	}
}