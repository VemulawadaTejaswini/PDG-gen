import java.util.*;

public class Main {

	static int n, m;
	static int[] dx = {0,0,-1,1}, dy = {-1,1,0,0};
//	static int[][] max;
	static boolean[][] map, check;

	public static int dfs (int y, int x, int step) {
		int max = step;
		for (int i = 0; i < dx.length; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (0 <= nextX && nextX < m &&
				0 <= nextY && nextY < n &&
				map[nextY][nextX] &&
				!check[nextY][nextX]) {
				check[nextY][nextX] = true;
				max = Math.max(dfs(nextY,nextX,step + 1),max);
				check[nextY][nextX] = false;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int ans = 0;
			m = sc.nextInt();
			n = sc.nextInt();
			if (m == 0 && n == 0) break;
//			max = new int[n][m];
			map = new boolean[n][m];
			check = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					map[i][j] = sc.nextInt() == 1;
					if (map[i][j]) {
						check[i][j] = true;
						ans = Math.max(dfs(i,j,1),ans);
						check[i][j] = false;
					}
				}
			}
			System.out.println(ans);
		}

	}
}