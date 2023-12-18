import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[][] f;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	static int dfs(int r, int c, int d) {
		int ret = 0;
		for (int i = 0; i < 4; ++i) {
			int nr = r + DR[i];
			int nc = c + DC[i];
			while (0 <= nr && nr < N && 0 <= nc && nc < M) {
				if (f[nr][nc] == 1) {
					f[nr][nc] = -1;
					ret += dfs(nr, nc, d - 1);
					f[nr][nc] = 1;
					break;
				}
				if (f[nr][nc] == 2 && d == 0) {
					return 1;
				}
				nr += DR[i];
				nc += DC[i];
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		while (true) {
			M = sc.nextInt();
			N = sc.nextInt();
			if (N == 0) break;
			f = new int[N][M];
			int d = 0;
			int r = 0;
			int c = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < M; ++j) {
					f[i][j] = sc.nextInt();
					if (f[i][j] == 1) ++d;
					if (f[i][j] == 2) {
						r = i;
						c = j;
					}
				}
			}
			System.out.println(dfs(r, c, d));
		}
	}
}