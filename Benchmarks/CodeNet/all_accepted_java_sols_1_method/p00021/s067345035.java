import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Point2D.Double a, b, c, d;
		double s1, s2;

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			b = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			c = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			d = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			if (a.x == b.x) {
				s1 = Double.POSITIVE_INFINITY;
			} else {
				s1 = (b.y - a.y) / (b.x - a.x);
			}
			if (c.x == d.x) {
				s2 = Double.POSITIVE_INFINITY;
			} else {
				s2 = (c.y - d.y) / (c.x - d.x);
			}
			if (s1 == s2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}