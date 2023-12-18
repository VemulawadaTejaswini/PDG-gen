import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DX = { 0, 1, 1, 0, -1, -1, 0 };
	static int[] DY = { 1, 0, -1, -1, -1, 0, 0 };

	public static void main(String[] arg) {
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int gx = sc.nextInt();
		int gy = sc.nextInt();
		int N = sc.nextInt();
		int[] ox = new int[N];
		int[] oy = new int[N];
		for (int i = 0; i < N; ++i) {
			ox[i] = sc.nextInt();
			oy[i] = sc.nextInt();
		}
		int LX = sc.nextInt();
		int LY = sc.nextInt();
		sx += LX;
		sy += LY;
		gx += LX;
		gy += LY;
		boolean[][] obst = new boolean[2 * LX + 1][2 * LY + 1];
		for (int i = 0; i < N; ++i) {
			obst[ox[i] + LX][oy[i] + LY] = true;
		}
		final int INF = 1 << 30;
		int[][][] dp = new int[2][2 * LX + 1][2 * LY + 1];
		for (int[] a : dp[0]) {
			Arrays.fill(a, INF);
		}
		int ans = INF;
		dp[0][sx][sy] = 0;
		{
			ArrayList<Point> cur = new ArrayList<Point>();
			cur.add(new Point(sx, sy));
			for (int t = 0;; ++t) {
				if (cur.isEmpty()) {
					System.out.println(-1);
					return;
				}
				ArrayList<Point> next = new ArrayList<Point>();
				for (Point p : cur) {
					for (int i = 0; i < 6; ++i) {
						int nx = p.x + DX[i];
						int ny = p.y + DY[i];
						if (i % 3 != 0 && p.x % 2 != 0) ny++;
						if (0 <= nx && nx <= 2 * LX && 0 <= ny && ny <= 2 * LY && !obst[nx][ny] && dp[0][nx][ny] == INF) {
							dp[0][nx][ny] = t + 1;
							next.add(new Point(nx, ny));
						}
					}
				}
				if (dp[0][gx][gy] != INF) {
					ans = dp[0][gx][gy];
					break;
				}
				cur = next;
			}
		}

		for (int[] a : dp[0]) {
			Arrays.fill(a, INF);
		}
		dp[0][sx][sy] = 0;
		int p = 1;
		for (int t = 0; t < (LX + LY) * 100; ++t) {
			for (int[] a : dp[p]) {
				Arrays.fill(a, INF);
			}
			boolean update = false;
			for (int x = 0; x <= 2 * LX; ++x) {
				for (int y = 0; y <= 2 * LY; ++y) {
					if (dp[1 - p][x][y] >= ans) continue;
					if (x == gx && y == gy) {
						ans = Math.min(ans, dp[1 - p][x][y]);
					}
					int d = Math.abs((x - LX) * (y - LY) * t) % 6;
					for (int k = 0; k < 7; ++k) {
						int add = k == d ? 0 : 1;
						int nx = x + DX[k];
						int ny = y + DY[k];
						if (k % 3 != 0 && x % 2 != 0) ny++;
						if (0 <= nx && nx <= 2 * LX && 0 <= ny && ny <= 2 * LY && !obst[nx][ny]) {
							dp[p][nx][ny] = Math.min(dp[p][nx][ny], dp[1 - p][x][y] + add);
							update = true;
						}
					}
				}
			}
			if (!update) break;
			p = 1 - p;
		}
		System.out.println(ans == INF ? -1 : ans);
	}
}