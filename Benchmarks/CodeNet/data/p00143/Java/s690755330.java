
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			Point2D.Double[] points = new Point2D.Double[5];
			for (int i = 0; i < 5; i++) {
				points[i] = new Point2D.Double(scanner.nextDouble(),
						scanner.nextDouble());
			}
			Path2D.Double path = new Path2D.Double();
			path.moveTo(points[0].x, points[0].y);
			path.lineTo(points[1].x, points[1].y);
			path.lineTo(points[2].x, points[2].y);
			if ((path.contains(points[3]) && path.contains(points[4]))
					|| !path.contains(points[3]) && !path.contains(points[4])) {
				System.out.println("NG");
			} else {
				System.out.println("OK");
			}
		}
	}
}