import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int M, N;
	static boolean[][] f;
	static int ans;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	static void dfs(int r, int c, int d) {
		f[r][c] = false;
		for (int i = 0; i < 4; ++i) {
			int nr = r + DR[i];
			int nc = c + DC[i];
			if (nr < 0 || N <= nr || nc < 0 || M <= nc || !f[nr][nc]) continue;
			dfs(nr, nc, d + 1);
		}
		f[r][c] = true;
		ans = Math.max(ans, d);
	}

	public static void main(String[] args) {
		while (true) {
			M = sc.nextInt();
			N = sc.nextInt();
			if (N == 0) break;
			f = new boolean[N][M];
			ans = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < M; ++j) {
					f[i][j] = sc.next().equals("1");
				}
			}
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < M; ++j) {
					if (f[i][j]) dfs(i, j, 1);
				}
			}
			System.out.println(ans);
		}
	}
}