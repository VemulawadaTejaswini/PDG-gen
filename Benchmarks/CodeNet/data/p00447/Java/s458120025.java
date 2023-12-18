
import java.awt.Point;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int M = scanner.nextInt();
			if (M == 0)
				break;
			Point[] xym = new Point[M];
			for (int i = 0; i < M; i++) {
				xym[i] = new Point(scanner.nextInt(), scanner.nextInt());
			}
			int N = scanner.nextInt();
			HashSet<Point> ps = new HashSet<Point>();
			for (int i = 0; i < N; i++) {
				ps.add(new Point(scanner.nextInt(), scanner.nextInt()));
			}
			loop: for (Point p : ps) {
				int dx = p.x - xym[0].x;
				int dy = p.y - xym[0].y;
				for (Point m : xym) {
					int nx = m.x + dx;
					int ny = m.y + dy;
					if (!ps.contains(new Point(nx, ny))) {
						continue loop;
					}
				}
				System.out.println(dx + " " + dy);
				break;
			}
		}
	}
}