import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	static Deque<Point> que;
	static Deque<Point> cornerque;
	static int[][] warpcnt;
	static boolean[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			H = sc.nextInt();
			W = sc.nextInt();
			warpcnt = new int[H][W];
			int CH = sc.nextInt() - 1;
			int CW = sc.nextInt() - 1;
			int DH = sc.nextInt() - 1;
			int DW = sc.nextInt() - 1;
			map = new boolean[H][W];
			for (int i = 0; i < H; i++) {
				String line = sc.next();
				for (int j = 0; j < W; j++) {
					map[i][j] = line.charAt(j) == '.';
					warpcnt[i][j] = -1;
				}
			}
			que = new ArrayDeque<>();
			cornerque = new ArrayDeque<>();
			warpcnt[CH][CW] = 0;
			Point C = new Point(CH, CW);
			que.add(C);
			while (!que.isEmpty()) {
				while (!que.isEmpty()) {
					Point tmp = que.remove();
					boolean up = move(tmp, 0, -1, 0);
					boolean down = move(tmp, 0, 1, 0);
					boolean left = move(tmp, 0, 0, -1);
					boolean right = move(tmp, 0, 0, 1);
					if (!up || !down || !left || !right) {
						cornerque.add(tmp);
					}
				}
				while (!cornerque.isEmpty()) {
					Point tmp = cornerque.remove();
					move(tmp, 1, -2, -1);
					move(tmp, 1, -2, 1);
					move(tmp, 1, -2, 0);
					move(tmp, 1, 2, -1);
					move(tmp, 1, 2, 0);
					move(tmp, 1, 2, 1);
					move(tmp, 1, -1, -2);
					move(tmp, 1, 0, -2);
					move(tmp, 1, 1, -2);
					move(tmp, 1, -1, 2);
					move(tmp, 1, 0, 2);
					move(tmp, 1, 1, 2);
					move(tmp, 1, -1, -1);
					move(tmp, 1, -2, -2);
					move(tmp, 1, -1, 1);
					move(tmp, 1, -2, 2);
					move(tmp, 1, 1, -1);
					move(tmp, 1, 2, -2);
					move(tmp, 1, 1, 1);
					move(tmp, 1, 2, 2);
				}
			}
			System.out.println(warpcnt[DH][DW]);
		}
	}

	static boolean move(Point p, int warp, int h, int w) {
		if (p.h + h < 0 || p.w + w < 0 || p.h + h >= H || p.w + w >= W) {
			// do nothing
			return false;
		}
		if (map[p.h + h][p.w + w]) {
			int wcnt = warpcnt[p.h + h][p.w + w];
			int nowcnt = warpcnt[p.h][p.w] + warp;
			if (wcnt == -1) {
				warpcnt[p.h + h][p.w + w] = nowcnt;
				if (warp == 0) {
					que.addFirst(new Point(p.h + h, p.w + w));
				} else {
					que.add(new Point(p.h + h, p.w + w));
				}
				return true;
			} else if (wcnt > nowcnt) {
				warpcnt[p.h + h][p.w + w] = nowcnt;
				if (warp == 0) {
					que.addFirst(new Point(p.h + h, p.w + w));
				} else {
					que.add(new Point(p.h + h, p.w + w));
				}
				return true;
			}
		}
		return false;
	}

	static class Point {
		int h;
		int w;
		int warp;

		public Point(int h, int w) {
			this.h = h;
			this.w = w;
			this.warp = 0;
		}
	}
}