
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n == 0)
				break;
			int[][] le = new int[n][n];
			int[][] se = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					le[i][j] = se[i][j] = INF;
				}
				le[i][i] = se[i][i] = 0;
			}
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				int c = scanner.nextInt();
				char t = scanner.next().charAt(0);
				if (t == 'L') {
					le[a][b] = le[b][a] = Math.min(le[a][b], c);
				} else
					se[a][b] = se[b][a] = Math.min(se[a][b], c);
			}
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					for (int k = 0; k < n; k++) {
						le[j][k] = Math.min(le[j][k], le[j][i] + le[i][k]);
						se[j][k] = Math.min(se[j][k], se[j][i] + se[i][k]);
					}
			int nq = scanner.nextInt();
			int[] q = new int[nq];
			for (int i = 0; i < nq; i++)
				q[i] = scanner.nextInt() - 1;
			int[][] dp = new int[2][n];
			for (int i = 0; i < n; i++)
				dp[0][i] = INF;
			dp[0][q[0]] = 0;
			for (int i = 1; i < nq; i++) {
				for (int j = 0; j < n; j++)
					dp[i % 2][j] = INF;
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						dp[i % 2][k] = Math.min(dp[i % 2][k],
								dp[(i + 1) % 2][j] + le[q[i - 1]][j] + se[j][k]
										+ le[k][q[i]]);
					}
					dp[i % 2][j] = Math.min(dp[i % 2][j], dp[(i + 1) % 2][j]
							+ le[q[i - 1]][q[i]]);
				}
			}
			int ans = INF;
			for (int i = 0; i < n; i++)
				ans = Math.min(ans, dp[(nq + 1) % 2][i]);
			System.out.println(ans);
		}
	}

	int INF = 1 << 25;
}