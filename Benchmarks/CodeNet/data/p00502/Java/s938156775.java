import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int d = sc.nextInt(), n = sc.nextInt();
		int[] t = new int[d];
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < d; i++)
			t[i] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		int INF = -1;
		int[][] dp = new int[d][n];
		for (int i = 0; i < n; i++) {
			if (!(a[i] <= t[0] && t[0] <= b[i]))
				dp[0][i] = INF;
		}
		
		for (int i = 1; i < d; i++) {
			for (int j = 0; j < n; j++) {
				if (!(a[j] <= t[i] && t[i] <= b[j]))
					dp[i][j] = INF;
				else {
					for (int k = 0; k < n; k++) {
						if (dp[i-1][k] != INF) {
							dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + Math.abs(c[j]-c[k]));
						}
					}
				}
			}
		}
		int res = -1;
		for (int i = 0; i < n; i++) {
			res = Math.max(res, dp[d-1][i]);
		}
		out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}