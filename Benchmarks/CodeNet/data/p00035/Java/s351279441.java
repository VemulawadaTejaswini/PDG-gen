import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[];
		Point2D.Double p[];
		boolean flag;

		p = new Point2D.Double[4];
		while (sc.hasNext()) {
			str = sc.next().split(",");
			flag = true;
			for (int i = 0; i < 4; i++) {
				p[i] = new Point2D.Double(Double.valueOf(str[2 * i]), Double.valueOf(str[2 * i + 1]));
			}
			double a, b;
			if (p[0].x == p[1].x) {
				a = Double.POSITIVE_INFINITY;
				b = Double.NaN;
			} else {
				a = (p[1].y - p[0].y) / (p[1].x - p[0].x);
				b = p[0].y - a * p[0].x;
			}
			if (Double.isNaN(b)) {
				if ((p[2].x - p[0].x) * (p[3].x - p[0].x) < 0) {
					flag = false;
				}
			} else {
				if (((a * p[2].x + b) - (a * p[0].x + b)) * ((a * p[3].x + b) - (a * p[0].x + b)) < 0) {
					flag = false;
				}
			}
			
			if (p[1].x == p[2].x) {
				a = Double.POSITIVE_INFINITY;
				b = Double.NaN;
			} else {
				a = (p[1].y - p[2].y) / (p[1].x - p[2].x);
				b = p[1].y - a * p[1].x;
			}
			if (Double.isNaN(b)) {
				if ((p[3].x - p[1].x) * (p[0].x - p[1].x) < 0) {
					flag = false;
				}
			} else {
				if (((a * p[3].x + b) - (a * p[1].x + b)) * ((a * p[0].x + b) - (a * p[1].x + b)) < 0) {
					flag = false;
				}
			}
			
			if (p[2].x == p[3].x) {
				a = Double.POSITIVE_INFINITY;
				b = Double.NaN;
			} else {
				a = (p[2].y - p[3].y) / (p[2].x - p[3].x);
				b = p[2].y - a * p[2].x;
			}
			if (Double.isNaN(b)) {
				if ((p[0].x - p[2].x) * (p[1].x - p[2].x) < 0) {
					flag = false;
				}
			} else {
				if (((a * p[0].x + b) - (a * p[2].x + b)) * ((a * p[1].x + b) - (a * p[2].x + b)) < 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}