import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	final int MAX = Integer.MAX_VALUE;
	
	void run() {
		while (true) {
			int n = sc.nextInt(), m = sc.nextInt();
			if (n == 0 && m == 0) break;
			
			int[] c = new int[m];
			int[] x = new int[n];
			for (int i = 0; i < m; i++)
				c[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				x[i] = sc.nextInt();
			
			int[][] dp = new int[n+1][256];
			for (int i = 0; i <= n; i++)
				for (int j = 0; j < 256; j++)
					dp[i][j] = MAX;
			dp[0][128] = 0;
			
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < 256; j++) {
					if (dp[i-1][j] < MAX) {
						for (int k = 0; k < m; k++) {
							int t;
							if (c[k] > 0)
								t = Math.min(j+c[k], 255);
							else 
								t = Math.max(j+c[k], 0);
							dp[i][t] = Math.min(dp[i][t], dp[i-1][j] + (x[i-1] - t)*(x[i-1] - t));
						}
					}
				}
			}
			Arrays.sort(dp[n]);
			out.println(dp[n][0]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}