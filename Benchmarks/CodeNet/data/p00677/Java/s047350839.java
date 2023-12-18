import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		while (true) {
			if (!sc.hasNext()) break;
			int s = sc.nextInt(), d = sc.nextInt(), m = sc.nextInt();
			int[] k = new int[s];
			int[][] w = new int[s][50];
			int[][] p = new int[s][50];
			for (int i = 0; i < s; i++) {
				k[i] = sc.nextInt();
				for (int j = 0; j < k[i]; j++) {
					w[i][j] = sc.nextInt();
					p[i][j] = sc.nextInt();
				}
			}
			int[] f = new int[d];
			for (int i = 0; i < d; i++)
				f[i] = sc.nextInt();
			
			int[][] dp = new int[d+1][m+1];
			for (int[] a : dp)
				Arrays.fill(a, -1);
			
			for (int i = 0; i <= d; i++)
				dp[i][m] = 0;
			
			for (int i = 0; i < d; i++) {
				for (int t = 1; t <= m; t++) {
					if (dp[i][t] >= 0) {
						for (int j = 0; j < k[f[i]]; j++) {
							if (t-p[f[i]][j] >= 0) {
								dp[i+1][t-p[f[i]][j]] = Math.max(dp[i+1][t-p[f[i]][j]], dp[i][t]+w[f[i]][j]);
							}
						}
					}
				}
			}
			
			int max = 0, rem = 0;
			for (int i = 0; i <= m; i++) {
				if (max <= dp[d][i]) {
					max = dp[d][i];
					rem = i;
				}
			}
			out.printf("%d %d\n", max, m-rem);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}