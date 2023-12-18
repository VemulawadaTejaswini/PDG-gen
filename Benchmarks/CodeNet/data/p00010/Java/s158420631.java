import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3, a, b, c, s, S, R, p, q;
		while (sc.hasNext()) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			x3 = sc.nextInt();
			y3 = sc.nextInt();
			a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
			c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
			s = (a + b + c) / 3;
			S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			R = (a * b * c) / (4 * S);
			p = ((y1 - y3) * (y1 * y1 - y2 * y2 + x1 * x1 - x2 * x2) - (y1 - y2)* (y1 * y1 - y3 * y3 + x1 * x1 - x3 * x3))/ (2 * (y1 - y3) * (x1 - x2) - 2 * (y1 - y2) * (x1 - x3));
			q = ((x1 - x3) * (x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2) - (x1 - x2)* (x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3))/ (2 * (x1 - x3) * (y1 - y2) - 2 * (x1 - x2) * (y1 - y3));
			System.out.printf("%.3f %.3f %.3f",p,q,R);
		}
	}
}