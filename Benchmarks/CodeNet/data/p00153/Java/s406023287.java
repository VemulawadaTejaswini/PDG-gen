
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
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
			double d0 = points[3].distance(points[0]);
			double d1 = points[3].distance(points[1]);
			double d2 = points[3].distance(points[2]);
			double ap = a.ptSegDist(points[3]);
			double bp = b.ptSegDist(points[3]);
			double cp = c.ptSegDist(points[3]);
			Path2D.Double path = new Path2D.Double();
			path.moveTo(points[0].x, points[0].y);
			path.lineTo(points[1].x, points[1].y);
			path.lineTo(points[2].x, points[2].y);

			if (d0 <= r && d1 <= r && d2 <= r) {
				System.out.println("b");
			} else if (path.contains(points[3])) {
				if (ap > r && bp > r && cp > r) {
					System.out.println("a");
				} else {
					System.out.println("c");
				}
			} else {
				if (d0 > r && d1 > r && d2 > r) {
					System.out.println("d");
				} else {
					System.out.println("c");
				}
			}

		}
	}
}