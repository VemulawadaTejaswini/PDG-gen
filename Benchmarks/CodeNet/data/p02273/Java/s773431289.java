import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		Point2D.Double a = new Point2D.Double(0.0d, 0.0d);
		Point2D.Double b = new Point2D.Double(100.0d, 0.0d);
		System.out.printf("%.8f %.8f \n", a.getX(), a.getY());
		koch(n, a, b);
		System.out.printf("%.8f %.8f \n", b.getX(), b.getY());
	}

	public static void koch(int n, Point2D a, Point2D b) {
		if(n == 0) return;
		Point2D s = new Point2D.Double();
		Point2D t = new Point2D.Double();
		Point2D u = new Point2D.Double();
		double th = Math.PI * 60.0 / 180.0;

		double sx = (2.0 * a.getX() + 1.0 * b.getX()) / 3.0;
		double sy = (2.0 * a.getY() + 1.0 * b.getY()) / 3.0;
		s.setLocation(sx, sy);

		double tx = (1.0 * a.getX() + 2.0 * b.getX()) / 3.0;
		double ty = (1.0 * a.getY() + 2.0 * b.getY()) / 3.0;
		t.setLocation(tx, ty);

		double ux = (tx - sx) * Math.cos(th) - (ty - sy) * Math.sin(th) + sx;
		double uy = (tx - sx) * Math.sin(th) + (ty - sy) * Math.cos(th) + sy;
		u.setLocation(ux, uy);

		koch(n - 1, a, s);
		System.out.printf("%.8f %.8f \n", s.getX(), s.getY());

		koch(n - 1, s, u);
		System.out.printf("%.8f %.8f \n", u.getX(), u.getY());

		koch(n - 1, u, t);
		System.out.printf("%.8f %.8f \n", t.getX(), t.getY());

		koch(n - 1, t, b);
	}
}

