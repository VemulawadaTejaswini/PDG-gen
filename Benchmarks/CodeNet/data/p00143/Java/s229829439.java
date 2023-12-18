
import java.awt.Polygon;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			Polygon polygon = new Polygon();
			for (int i = 0; i < 3; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				polygon.addPoint(x, y);
			}
			Point2D.Double[] points = new Point2D.Double[2];
			boolean[] b = new boolean[2];
			for (int i = 0; i < 2; i++) {
				points[i] = new Point2D.Double(scanner.nextDouble(),
						scanner.nextDouble());
				b[i] = polygon.contains(points[i]);
			}
			System.out.println(b[0] ^ b[1] ? "OK" : "NG");

		}
	}
}