import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			if ((n | m | l) == 0)
				break;
			double[][] dis = new double[n + 1][n + 1];
			Star[] stars = new Star[n + 1];
			for (int i = 1; i <= n; i++) {
				Arrays.fill(dis[i], Double.MAX_VALUE);
				dis[i][i] = 0;
			}
			for (int i = 1; i <= n; i++) {
				stars[i] = new Star(sc.nextDouble(), sc.nextDouble(),
						sc.nextDouble(), sc.nextDouble());
			}
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					dis[i][j] = dis[j][i] = stars[i].minDistance(stars[j]);
				}
			}
			System.out.println();
			for (int k = 1; k <= n; k++) {
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
					}
				}
			}
			System.out.printf("%.10f\n", dis[m][l]);
		}
	}
}

class Star {
	Line[] ls = new Line[5];

	Star(double sx, double sy, double a, double r) {
		double x = sx - r * Math.sin(Math.PI * a / 180);
		double y = sy + r * Math.cos(Math.PI * a / 180);
		Point2D.Double[] ps = new Point2D.Double[5];
		ps[0] = new Point2D.Double(x, y);
		double cos = Math.cos(Math.PI * 72 / 180);
		double sin = Math.sin(Math.PI * 72 / 180);
		for (int i = 1; i < 5; i++) {
			double xd = (cos * (x - sx) - sin * (y - sy)) + sx;
			double yd = (sin * (x - sx) + cos * (y - sy)) + sy;
			ps[i] = new Point2D.Double(xd, yd);
			x = xd;
			y = yd;
		}
		ls[0] = new Line(ps[0], ps[2]);
		ls[1] = new Line(ps[2], ps[4]);
		ls[2] = new Line(ps[4], ps[1]);
		ls[3] = new Line(ps[1], ps[3]);
		ls[4] = new Line(ps[3], ps[0]);
	}

	public double minDistance(Star star2) {
		Star star1 = this;
		double min = Double.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				min = Math.min(min, star1.ls[i].minDistance(star2.ls[j]));
			}
		}
		return min;
	}

	public String toString() {
		return this.ls[0] + " " + this.ls[1] + " " + this.ls[2] + " "
				+ this.ls[3] + " " + this.ls[4];
	}
}

class Line {
	public Point2D.Double p1;
	public Point2D.Double p2;

	Line(Point2D.Double p1, Point2D.Double p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public double length() {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
				* (p1.y - p2.y));
	}

	public double ip(Line l) {
		Point2D.Double q1 = l.p1;
		Point2D.Double q2 = l.p2;
		return (p2.x - p1.x) * (q2.x - q1.x) + (p2.y - p1.y) * (q2.y - q1.y);
	}

	public double ep(Line l) {
		Point2D.Double q1 = l.p1;
		Point2D.Double q2 = l.p2;
		return (p2.x - p1.x) * (q2.y - q1.y) - (p2.y - p1.y) * (q2.x - q1.x);
	}

	public double disToPoint(Point2D.Double q1) {
		Line p1q1 = new Line(p1, q1);
		double ip1 = p1q1.ip(this);
		double ip2 = this.ip(this);
		if (ip1 <= 0)
			return p1q1.length();
		else if (0 < ip1 && ip1 < ip2) {
			double d2 = ip1 / this.length();
			double size = p1q1.length();
			return Math.sqrt(size * size - d2 * d2);
		} else {
			Line p2q1 = new Line(p2, q1);
			return p2q1.length();
		}
	}

	public boolean isCross(Line q1q2) {
		Point2D.Double q1 = q1q2.p1;
		Point2D.Double q2 = q1q2.p2;
		Line p1q1 = new Line(p1, q1);
		Line p1q2 = new Line(p1, q2);
		Line q1p1 = new Line(q1, p1);
		Line q1p2 = new Line(q1, p2);
		if (this.ep(p1q1) * this.ep(p1q2) < 0
				&& q1q2.ep(q1p1) * q1q2.ep(q1p2) < 0)
			return true;
		else
			return false;
	}

	public double minDistance(Line q1q2) {
		if (this.isCross(q1q2))
			return 0;
		double ans = Double.MAX_VALUE;
		Point2D.Double q1 = q1q2.p1;
		Point2D.Double q2 = q1q2.p2;
		ans = Math.min(ans, this.disToPoint(q1));
		ans = Math.min(ans, this.disToPoint(q2));
		ans = Math.min(ans, q1q2.disToPoint(p1));
		ans = Math.min(ans, q1q2.disToPoint(p2));
		return ans;
	}

	public String toString() {
		return p1 + "=>" + p2;
	}
}