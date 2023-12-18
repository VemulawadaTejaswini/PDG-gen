import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt(), w = s.nextInt(), n = s.nextInt();
		char[][] cs = new char[h][];
		for (int i = 0; i < h; ++i) {
			cs[i] = s.next().toCharArray();
		}
		int[][] p = new int[n + 1][];
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				if (cs[i][j] == 'S') {
					p[0] = new int[] { i, j };
				} else if ('0' <= cs[i][j] && cs[i][j] <= '0' + n) {
					p[cs[i][j] - '0'] = new int[] { i, j };
				}
			}
		}
		int r = 0;
		for (int c = 1; c <= n; ++c) {
			boolean[][] cst = new boolean[h][w];
			Deque<int[]> q = new ArrayDeque<int[]>();
			q.add(new int[] { p[c - 1][0], p[c - 1][1], 0 });
			while (!q.isEmpty()) {
				int[] u = q.poll();
				if (u[0] == p[c][0] && u[1] == p[c][1]) {
					r += u[2];
					break;
				}
				cst[u[0]][u[1]] = true;
				int[] dx = { -1, 0, 0, 1 };
				int[] dy = { 0, -1, 1, 0 };
				for (int d = 0; d < 4; ++d) {
					int x = u[0] + dx[d], y = u[1] + dy[d];
					if (0 <= x && x < h && 0 <= y && y < w) {
						if (!cst[x][y] && cs[x][y] != 'X') {
							cst[x][y] = true;
							q.add(new int[] { x, y, u[2] + 1 });
						}
					}
				}
			}
		}
		System.out.println(r);
	}
}