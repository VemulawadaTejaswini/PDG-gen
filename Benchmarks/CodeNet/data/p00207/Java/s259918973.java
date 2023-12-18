
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			int xs = scanner.nextInt();
			int ys = scanner.nextInt();
			xg = scanner.nextInt();
			yg = scanner.nextInt();
			int n = scanner.nextInt();
			map = new int[h + 2][w + 2];

			for (int i = 0; i < n; i++) {
				int c = scanner.nextInt();
				int d = scanner.nextInt();
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				if (d == 0) {
					for (int j = 0; j < 2; j++) {
						for (int k = 0; k < 4; k++) {
							map[j + y][k + x] = c;

						}
					}
				} else {
					for (int j = 0; j < 4; j++) {
						for (int k = 0; k < 2; k++) {
							map[j + y][k + x] = c;
						}
					}
				}
			}
			color = map[ys][xs];
			b = new boolean[h + 2][w + 2];
			if (color == 0)
				System.out.println("NG");
			else
				System.out.println(slove(xs, ys) ? "OK" : "NG");
		}

	}

	private boolean slove(int x, int y) {
		PriorityQueue<Point> pq = new PriorityQueue<Point>();
		pq.add(new Point(y, x, getDis(x, y)));
		b[y][x] = true;
		while (!pq.isEmpty()) {
			Point point = pq.poll();
			x = point.x;
			y = point.y;

			if (point.dis == 0)
				return true;

			for (int[] a : dxy) {
				int dx = a[1] + x;
				int dy = a[0] + y;
				if (b[dy][dx])
					continue;
				if (map[dy][dx] != color)
					continue;
				pq.add(new Point(dy, dx, getDis(dx, dy)));
				b[dy][dx] = true;
			}
		}
		return false;
	}

	private int getDis(int x, int y) {
		return Math.abs(yg - y) + Math.abs(xg - x);
	}

	class Point implements Comparable<Point> {
		int y;
		int x;
		int dis;

		@Override
		public int compareTo(Point o) {
			return this.dis - o.dis;
		}

		public Point(int y, int x, int dis) {
			super();
			this.y = y;
			this.x = x;
			this.dis = dis;
		}
	}

	int[][] dxy = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	boolean[][] b;
	int[][] map;
	int xg;
	int yg;
	int color;
}