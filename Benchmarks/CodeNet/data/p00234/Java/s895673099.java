
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			int f = scanner.nextInt();
			int m = scanner.nextInt();
			int o = scanner.nextInt();
			int[][] map = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = scanner.nextInt();
				}
			}
			int min = f + 1;
			for (int i = 0; i < w; i++) {
				int[][] tmpMap  = map.clone();
				PriorityQueue<Point> pq = new PriorityQueue<Point>();
				pq.offer(new Point(0, i, -map[0][i], o - 1));
				while (!pq.isEmpty()) {
					Point point = pq.poll();
					int y = point.y;
					int x = point.x;
					if (point.cost >= min)
						break;
					if (point.o == 0)
						continue;
					if (y == h - 1) {
						min = point.cost;
						break;
					}
					for (int r = 0; r < 3; r++) {
						int[] mo = move[r];
						int ny = mo[0] + y;
						int nx = mo[1] + x;
						if (nx < 0 || w <= nx)
							continue;
						if (map[ny][nx] >= 0) {
							pq.offer(new Point(ny, nx, point.cost, Math.min(m,
									point.o - 1 + tmpMap[ny][nx])));
							tmpMap[ny][nx] = 0;
							
						} else {
							pq.offer(new Point(ny, nx,
									point.cost - tmpMap[ny][nx], point.o - 1));
						}
					}
				}
			}
			System.out.println(min == f + 1 ? "NA" : min);
		}
	}

	int[][] move = { { 0, -1 }, { 1, 0 }, { 0, 1 } };

	class Point implements Comparable<Point> {
		int y;
		int x;
		int cost;
		int o;


		public Point(int y, int x, int cost, int o) {
			super();
			this.y = y;
			this.x = x;
			this.cost = cost;
			this.o = o;
		}

		@Override
		public String toString() {
			return "Point [y=" + y + ", x=" + x + ", cost=" + cost + ", o=" + o
					+ "]";
		}

		@Override
		public int compareTo(Point o) {
			return this.cost - o.cost;
		}

	}
}