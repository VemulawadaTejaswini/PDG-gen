
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			m = scanner.nextInt();
			if (m == 0)
				break;
			n = scanner.nextInt();
			int s = scanner.nextInt();
			int[][][] map = new int[s][n][m];
			for (int i = 0; i < s; i++) {
				int x = scanner.nextInt() - 1;
				int y = scanner.nextInt() - 1;
				map[i] = dfs(x, y);
			}
			int v = scanner.nextInt();
			int max = 0;
			while (v-- > 0) {
				int c = 0;
				int x = scanner.nextInt() - 1;
				int y = scanner.nextInt() - 1;
				int[][] r = dfs(x, y);
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						boolean flag = true;
						for (int k = 0; k < s; k++) {
							if (map[k][i][j] <= r[i][j]) {
								flag = false;
								break;
							}
						}
						if (flag)
							c++;
					}
				}
				max = Math.max(max, c);

			}
			System.out.println(max);
		}
	}

	private int[][] dfs(int x, int y) {
		int[][] tmp = new int[n][m];
		Deque<Point> deque = new ArrayDeque<Main.Point>();
		deque.offer(new Point(y, x));
		boolean[][] b = new boolean[n][m];
		b[y][x] = true;
		int step = 1;
		while (!deque.isEmpty()) {
			int size = deque.size();
			for (int i = 0; i < size; i++) {
				Point point = deque.poll();
				if (point.y % 2 == 0) {
					slove(deque, point, move, b, tmp, step);
				} else {
					slove(deque, point, move2, b, tmp, step);
				}
			}
			step++;
		}
		return tmp;
	}

	private void slove(Deque<Point> deque, Point point, int[][] move,
			boolean[][] b, int[][] tmp, int step) {
		for (int[] a : move) {
			int dy = point.y + a[0];
			int dx = point.x + a[1];
			if (0 <= dy && dy < n && 0 <= dx && dx < m && !b[dy][dx]) {
				b[dy][dx] = true;
				tmp[dy][dx] = step;
				deque.offer(new Point(dy, dx));
			}
		}
	}

	class Point {
		int y;
		int x;

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

	}

	int[][] move = { { -1, -1 }, { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, -1 },
			{ 1, 0 } };
	int[][] move2 = { { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, 0 },
			{ 1, 1 } };

	int m;
	int n;
}