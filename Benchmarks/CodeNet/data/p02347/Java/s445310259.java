
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Point2D.Double[] point = new Point2D.Double[n];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			point[i] = new Point2D.Double(x, y);
		}
		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			double sx = scanner.nextInt() - 0.1;
			double tx = scanner.nextInt() + 0.1;
			double sy = scanner.nextInt() - 0.1;
			double ty = scanner.nextInt() + 0.1;
			Path2D.Double path = new Path2D.Double();
			path.moveTo(sx, sy);
			path.lineTo(tx, sy);
			path.lineTo(tx, ty);
			path.lineTo(sx, ty);
			for (int j = 0; j < n; j++) {
				if (path.contains(point[j]))
					System.out.println(j);
			}
			System.out.println();
		}

	}
}