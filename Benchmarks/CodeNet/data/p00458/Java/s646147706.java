import java.util.*;

public class Main {

	static int n, m, max;
	static boolean[][] map, check;
	static int[] dx = {0,0,-1,1}, dy = {-1,1,0,0};

	public static void dfs (int y, int x, int step) {
		check[y][x] = true;
		boolean f = true;
		for (int i = 0; i < dx.length; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (0 <= nextX && nextX < m &&
				0 <= nextY && nextY < n &&
				map[nextY][nextX] &&
				!check[nextY][nextX]) {
				f = false;
				dfs(nextY,nextX,step + 1);
			}
		}
		if (f) max = Math.max(step, max);
		check[y][x] = false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			max = -1;
			m = sc.nextInt();
			n = sc.nextInt();
			if (m == 0 && n == 0) break;
			map = new boolean[n][m];
			check = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					map[i][j] = sc.nextInt() == 1;
					if (map[i][j]) {
						dfs(i,j,1);
						check = new boolean[n][m];
					}
				}
			}
			System.out.println(max);
		}

	}
}