
import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int INF = 1<<25;
		while (true) {
			r = scanner.nextInt();
			if (r == 0)
				break;
			map = new int[2][250001];
			for (int[] m : map)
				Arrays.fill(m, INF);
			map[0][0] = map[1][0] = 0;

			for (int i = 0; i < 2; i++) {
				w = scanner.nextInt();
				h = scanner.nextInt();
				sx = scanner.nextInt() - 1;
				sy = scanner.nextInt() - 1;
				int[][] m = new int[h][w];
				for (int j = 0; j < h; j++)
					for (int k = 0; k < w; k++)
						m[j][k] = scanner.nextInt();
				slove(m, i);
			}
			int res = INF;
			for (int i = 0; i <= r; i++)
				res = Math.min(res, map[0][i] + map[1][r - i]);
			System.out.println(res);
		}
	}

	private void slove(int[][] m, int i) {
		boolean[][] b = new boolean[h][w];
		b[sy][sx] = true;
		PriorityQueue<Point> pq = new PriorityQueue<Point>();
		pq.offer(new Point(m[sy][sx], sy, sx));
		int l = -1;
		int id = 1;
		while (!pq.isEmpty()) {
			Point p = pq.poll();
			l = Math.max(l, p.k);
			map[i][id++] = l;
			for (int[] mo : move) {
				int ny = p.y + mo[0];
				int nx = p.x + mo[1];
				if (!isOK(ny, nx))
					continue;
				if (b[ny][nx])
					continue;
				b[ny][nx] = true;
				pq.offer(new Point(m[ny][nx], ny, nx));
			}
		}

	}

	private boolean isOK(int ny, int nx) {
		if (0 <= ny && ny < h && 0 <= nx && nx < w)
			return true;
		return false;
	}

	int r, w, h, sx, sy;
	int[][] map;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	class Point implements Comparable<Point> {
		int k, y, x;

		@Override
		public String toString() {
			return "Point [k=" + k + ", y=" + y + ", x=" + x + "]";
		}

		public Point(int k, int y, int x) {
			super();
			this.k = k;
			this.y = y;
			this.x = x;
		}

		@Override
		public int compareTo(Point o) {
			return k - o.k;
		}

	}
}