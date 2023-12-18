import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",|\\s+");
		double EPS = 1e-10;
		while (sc.hasNext()) {
			Point2D.Double p1 = new Point2D.Double(sc.nextDouble(),
					sc.nextDouble());
			Point2D.Double p2 = new Point2D.Double(sc.nextDouble(),
					sc.nextDouble());
			Point2D.Double q = new Point2D.Double(sc.nextDouble(),
					sc.nextDouble());
			if (Math.abs(p2.y - p1.y) < EPS) {
				System.out.printf("%.6f %.6f\n", q.x, (p1.y - q.y) + p1.y);
				continue;
			}
			if (Math.abs(p2.x - p1.x) < EPS) {
				System.out.printf("%.6f %.6f\n", (p1.x - q.x) + p1.x, q.y);
				continue;
			}
			double a = (p2.y - p1.y) / (p2.x - p1.x);
			double b = p2.y - a * p2.x;
			double ep = 0;
			if (p1.x < p2.x)
				ep = new Line(p1, p2).ep(new Line(p1, q));
			else
				ep = new Line(p2, p1).ep(new Line(p2, q));
			double th = 2 * Math.atan(a);
			double rx = 0;
			double ry = 0;
			if (ep < 0) {
				rx = Math.cos(th) * q.x + Math.sin(th) * (q.y - b);
				ry = Math.sin(th) * q.x - Math.cos(th) * (q.y - b) + b;
			} else {
				rx = Math.cos(-th) * q.x + Math.sin(-th) * (q.y - b) + b;
				ry = Math.sin(-th) * q.x - Math.cos(-th) * (q.y - b) + b;
			}
			System.out.printf("%.6f %.6f\n", rx, ry);

		}

		// 平面上の異なる3点 P1(x1,y1), P2(x2,y2), Q(xq,yq)
		// の座標の組をファイルから読み込んで、それぞれの組について、点P1 点P2 を通る直線を対称軸として点 Q と線対称の位置にある点
		// R(x,y) を出力して終了するプログラムを作成してください。なお、点Q は、その対称軸上にないものとします。
		// 入力
		//
		// x1,y1,x2,y2,xq,yq (1件目のデータ：全て実数）
		// ：　 　　（2件目のデータ：全て実数）
		//
		// 出力
		//
		// x y （1件目のデータに対する出力：全て実数空白区切り）
		// : （2件目のデータに対する出力：全て実数空白区切り）
		//
		// 出力は0.0001以下の誤差を含んでもよい。
		// Sample Input
		//
		// 1.0,0.0,-1.0,0.0,1.0,1.0
		// 1.0,0.0,0.0,-1.0,3.0,0.0
		// 0.0,1.0,0.0,-1.0,1.0,1.0

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