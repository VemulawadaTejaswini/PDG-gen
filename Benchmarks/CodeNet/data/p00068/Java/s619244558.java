import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			Point ps[] = new Point[n];
			sc.useDelimiter(",|\\s+");
			for (int i = 0; i < n; i++) {
				ps[i] = new Point(sc.nextDouble(), sc.nextDouble());
			}
			Point[] qs = convexHull(ps);
			System.out.println(n - qs.length);
		}
	}

	static double cross(Point a, Point b) {
		return a.y * b.x - a.x * b.y;
	}

	static double dot(Point a, Point b) {
		return a.x * b.x + a.y * b.y;
	}

	static Point[] convexHull(Point[] V) {
		int n = V.length;
		Arrays.sort(V); // x, yのプライオリティで昇順ソート
		int k = 0; // resのindex
		Point[] res = new Point[2 * n];
		/* lower-hull */
		for (int i = 0; i < n; res[k++] = V[i++])
			while (k >= 2 && ccw(res[k - 2], res[k - 1], V[i]) <= 0)
				--k;
		/* upper-hull */
		// t=|lower-hull|+1
		for (int i = n - 2, t = k + 1; i >= 0; res[k++] = V[i--])
			while (k >= t && ccw(res[k - 2], res[k - 1], V[i]) <= 0)
				--k;

		return Arrays.copyOf(res, k - 1); // 最後の点res[k-1]はlower-hullの始点なのでいらない
	}

	static int ccw(Point a, Point b, Point c) {
		Point tempb = b.sub(a);
		Point tempc = c.sub(a);
		if (cross(tempb, tempc) > 0)
			return +1; // counter clockwise
		if (cross(tempb, tempc) < 0)
			return -1; // clockwise
		if (dot(tempb, tempc) < 0)
			return +2; // (c--a--b or b--a--c) on line
		if (tempb.normsq() < tempc.normsq())
			return -2; // (a--b--c or c--b--a) on line (a=b≠c)
		return 0; // (a--c--b or b--c--a) on line (c=b, a=c, a=b=cも含む)
	}
}

class Point extends Point2D.Double implements Comparable<Point> {
	static final double EPS = 1e-10;

	static boolean EQ(double a, double b) {
		return Math.abs(a - b) < EPS;
	}

	private static final long serialVersionUID = -1781994971111328877L;

	// constructor
	public Point() {
		super();
	}

	public Point(double x, double y) {
		super(x, y);
	}

	public Point(Point p) {
		super(p.x, p.y);
	}

	// setter
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void set(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	// norm
	public double norm() {
		return Math.sqrt(normsq());
	}

	public double normsq() {
		return x * x + y * y;
	}

	// addition, subtraction, multiplication, division
	public Point add(Point p) {
		return new Point(x + p.x, y + p.y);
	}

	public Point sub(Point p) {
		return new Point(x - p.x, y - p.y);
	}

	public Point mul(double k) {
		return new Point(k * x, k * y);
	}

	public Point div(double k) {
		return new Point(x / k, y / k);
	}

	// 単位法線ベクトル(の一つ)
	public Point normalVector() {
		double d = this.norm();
		return new Point(-y / d, x / d);
	}

	// compareTo x座標優先比較
	public int compareTo(Point o) {
		return (this.x != o.x) ? ((this.x < o.x) ? -1 : 1)
				: ((this.y < o.y) ? -1 : (this.y > o.y) ? 1 : 0);
	}
	// ........................................
} // class Point