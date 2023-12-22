import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Point2D.Double p[];
		String str[];
		
		p = new Point2D.Double[4];
		while (sc.hasNext()) {
			str = sc.nextLine().split(" ");
			for (int i = 0; i < 4; i++) {
				p[i] = new Point2D.Double(Double.valueOf(str[2 * i]), Double.valueOf(str[2 * i + 1]));
			}
			double dx1, dx2, dy1, dy2;
			dx1 = p[1].x - p[0].x;
			dy1 = p[1].y - p[0].y;
			dx2 = p[2].x - p[3].x;
			dy2 = p[2].y - p[3].y;
			if (dx1 * dx2 + dy1 * dy2 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}