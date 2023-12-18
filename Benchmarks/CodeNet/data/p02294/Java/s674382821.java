import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

	static int n;
	static double[] x1, y1, x2, y2;
	static double sx, sy, gx, gy;
	static Point[][] seg;
	static ArrayList<Integer>[] g;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			Point s1 = new Point(sc.nextDouble(), sc.nextDouble());
			Point d1 = new Point(sc.nextDouble(), sc.nextDouble());
			Point s2 = new Point(sc.nextDouble(), sc.nextDouble());
			Point d2 = new Point(sc.nextDouble(), sc.nextDouble());
			if (linesIntersect(s1, d1, s2, d2)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		// ArrayList<Point> ps = new ArrayList<>();
		// n = sc.nextInt();
		// x1 = new double[n];
		// y1 = new double[n];
		// x2 = new double[n];
		// y2 = new double[n];
		// seg = new Point[n][2];
		// for (int i = 0; i < n; ++i) {
		// x1[i] = sc.nextDouble();
		// y1[i] = sc.nextDouble();
		// x2[i] = sc.nextDouble();
		// y2[i] = sc.nextDouble();
		// Point p1 = new Point(x1[i], y1[i]);
		// Point p2 = new Point(x2[i], y2[i]);
		// ps.add(p1);
		// ps.add(p2);
		// seg[i] = new Point[] { p1, p2 };
		// }
		// sx = sc.nextDouble();
		// sy = sc.nextDouble();
		// gx = sc.nextDouble();
		// gy = sc.nextDouble();
		// for (int i = 0; i < n; ++i) {
		//
		// }
	}

	static int gen = 0;

	static class Point {
		double x, y;
		int id;

		public Point(double x1, double y1) {
			this.x = x1;
			this.y = y1;
			id = gen++;
		}
	}

	static boolean linesIntersect(Point s1, Point d1, Point s2, Point d2) {
		long prd1 = ccw(s1, d1, d2) * ccw(s1, d1, s2);
		long prd2 = ccw(s2, d2, s1) * ccw(s2, d2, d1);
		return prd1 <= 0 && prd2 <= 0;
	}

	static long ccw(Point s, Point d, Point p) {
		double cp = crossProduct(s, d, s, p);
		if (cp != 0)
			return Double.compare(cp, 0);
		else {
			if (dotProduct(s, d, s, p) < 0)
				return -2;
			else if (dotProduct(d, s, d, p) < 0)
				return 2;
			else
				return 0;
		}
	}

	static double crossProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.y - s2.y) - (d1.y - s1.y) * (d2.x - s2.x);
	}

	static double dotProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.x - s2.x) + (d1.y - s1.y) * (d2.y - s2.y);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}