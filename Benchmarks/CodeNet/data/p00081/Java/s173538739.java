import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Point2D.Double p1, p2, q, r;
		String st[];
		
		while (sc.hasNext()) {
			st = sc.next().split(",");
			p1 = new Point2D.Double(Double.valueOf(st[0]), Double.valueOf(st[1]));
			p2 = new Point2D.Double(Double.valueOf(st[2]), Double.valueOf(st[3]));
			q  = new Point2D.Double(Double.valueOf(st[4]), Double.valueOf(st[5]));
			r  = new Point2D.Double();
			
			if (p1.x == p2.x) {
				r.x = p1.x + p1.x - q.x;
				r.y = q.y;
			} else if (p1.y == p2.y) {
				r.x = q.x;
				r.y = p1.y + p1.y - q.y;
			} else {
				double a1, b1, a2, b2;
				double x, y;
				a1 = (p2.y - p1.y) / (p2.x - p1.x);
				b1 = p1.y - a1 * p1.x;
				a2 = -1.0 / a1;
				b2 = q.y - a2 * q.x;
				x = (b2 - b1) / (a1 - a2);
				y = a1 * x + b1;
				r.x = x + x - q.x;
				r.y = y + y - q.y;
			}
			System.out.println(r.x + " " + r.y);
		}
	}
}