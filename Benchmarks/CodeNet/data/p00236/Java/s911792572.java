
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		loop: while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			boolean[][] map = new boolean[h][w];
			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = scanner.nextInt() == 1;
					if (!map[i][j])
						ans++;
				}
			}
			if (ans % 2 == 1) {
				System.out.println("No");
				continue loop;
			}
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j])
						continue;
					int count = 0;
					for (int k = 0; k < 4; k++) {
						int y = i + move[k][0];
						int x = j + move[k][1];
						if (y < 0 || h <= y || x < 0 || w <= x)
							continue;
						if (!map[y][x])
							count++;
					}
					if (count < 2) {
						System.out.println("No");
						continue loop;
					}
				}
			}
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!map[i][j]) {
						if (slove(map, i, j)) {
							System.out.println("Yes");
						} else {
							System.out.println("No");
						}
						continue loop;
					}
				}
			}
			System.out.println("No");

		}
	}

	private boolean slove(boolean[][] map, int y, int x) {
		int yx = y * h + x;
		Deque<Point> deque = new ArrayDeque<Main.Point>();
		boolean[][] tmp = new boolean[h][w];
		for (int i = 0; i < h; i++)
			tmp[i] = Arrays.copyOf(map[i], w);
		deque.push(new Point(y, x, -100, tmp));
		while (!deque.isEmpty()) {
			Point point = deque.poll();
			int py = point.y;
			int px = point.x;
			int pr = point.r;
			if (point.map[y][x] && py == y && px == x) {
				if (check(point.map)) {
					return true;
				}
			}
			point.map[py][px] = true;
			for (int r = 0; r < 4; r++) {
				if (Math.max(r, pr) - Math.min(r, pr) == 2)
					continue;
				int ny = py + move[r][0];
				int nx = px + move[r][1];
				if (ny < 0 || h <= ny || nx < 0 || w <= nx)
					continue;
				if (point.map[ny][nx] && ny * h + nx != yx)
					continue;
				boolean[][] tmpMap = new boolean[h][w];
				for (int i = 0; i < h; i++)
					tmpMap[i] = Arrays.copyOf(point.map[i], w);

				deque.push(new Point(ny, nx, r, tmpMap));
			}
		}
		return false;

	}

	private boolean check(boolean[][] map) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (!map[i][j])
					return false;
			}
		}
		return true;
	}

	int w;
	int h;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

	class Point {
		int y, x, r;
		boolean[][] map;

		public Point(int y, int x, int r, boolean[][] map) {
			super();
			this.y = y;
			this.x = x;
			this.r = r;
			this.map = map;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			for (boolean[] a : map)
				builder.append(Arrays.toString(a)).append('\n');
			return "Point [y=" + y + ", x=" + x + ", r=" + r + ", map=\n"
					+ builder + "]";
		}

	}
}