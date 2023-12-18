import java.io.IOException;
import java.util.Scanner;

/**
 */
class main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		while(in.hasNext()) {
			Point p1 = getPoint(in);
			Point p2 = getPoint(in);
			Point p3 = getPoint(in);
			Point p4 = getPoint(in);

//			if(PointUtil.isParallel(p1, p2, p3, p4)) {
				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
		}
	}

	public static Point getPoint(Scanner in) {
		double x = in.nextDouble();
		double y = in.nextDouble();
		return new Point(x, y);
	}
}

class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point getMinus(Point p2) {
		double sx = this.x - p2.getX();
		double sy = this.y - p2.getY();
		return new Point(sx,sy);
	}

	public double len() {
		return x*x + y*y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}

class PointUtil {
	public static double EPS = 1e-6;
	/**
	 * angle of vec(p1-p) and vec(p2-p)
	 * @param p1
	 * @param p2
	 * @return
	 */
	public static double angleRad(Point p1, Point p2, Point p) {
		double a1 = p1.getX() - p.getX();
		double a2 = p1.getY() - p.getY();
		double b1 = p2.getX() - p.getX();
		double b2 = p2.getY() - p.getY();

		return Math.acos((a1*b1+a2*b2) / ( Math.sqrt(a1*a1 + a2*a2) * Math.sqrt(b1*b1 + b2*b2)));
	}

	public static boolean isParallel(Point a1, Point a2, Point b1, Point b2) {
		return EQ(cross(a1.getMinus(a2), b1.getMinus(b2)), 0.0);
	}

	public static double cross(Point vec1, Point vec2) {
		return vec1.getX()*vec2.getY() - vec1.getY()*vec2.getX();
	}

	public static boolean EQ(double left, double right) {
		if(Math.abs(left - right) <= EPS) {
			return true;
		}
		return false;
	}
}