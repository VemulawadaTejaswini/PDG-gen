import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Point2D.Double a = new Point2D.Double(sc.nextDouble(),
					sc.nextDouble());
			Point2D.Double b = new Point2D.Double(sc.nextDouble(),
					sc.nextDouble());
			Point2D.Double c = new Point2D.Double(sc.nextDouble(),
					sc.nextDouble());
			Point2D.Double p = new Point2D.Double(sc.nextDouble(),
					sc.nextDouble());
			Point2D.Double ab = new Point2D.Double(b.x - a.x, b.y - a.y);
			Point2D.Double bc = new Point2D.Double(c.x - b.x, c.y - b.y);
			Point2D.Double ca = new Point2D.Double(a.x - c.x, a.y - c.y);
			Point2D.Double ap = new Point2D.Double(p.x - a.x, p.y - a.y);
			Point2D.Double bp = new Point2D.Double(p.x - b.x, p.y - b.y);
			Point2D.Double cp = new Point2D.Double(p.x - c.x, p.y - c.y);
			String ans = !isPositiveEP(ab,ap) ? "NO" : !isPositiveEP(bc,bp) 
						 					  ? "NO" : !isPositiveEP(ca, cp) ? "NO" : "YES";
			System.out.println(ans);

		}
	}

	public static Boolean isPositiveEP(Point2D.Double a, Point2D.Double b) {
		return (a.x * b.y - a.y * b.x) > 0;
	}
}