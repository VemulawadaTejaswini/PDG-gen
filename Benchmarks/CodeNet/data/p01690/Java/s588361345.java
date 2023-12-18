
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int s, t, u, n, o, d;
	int[] e, c, h, a;

	void run() {
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt(); t = sc.nextInt(); u = sc.nextInt(); n = sc.nextInt(); o = sc.nextInt(); d = sc.nextInt();
		e = new int[t]; c = new int[t]; h = new int[n]; a = new int[n];
		
		for (int i=0;i<t;i++) {
			e[i] = sc.nextInt(); c[i] = sc.nextInt();
		}
		
		for (int i=0;i<n;i++) {
			h[i] = sc.nextInt(); a[i] = sc.nextInt();
		}
		
		int[][] dp = new int[2][s+1];
		fill(dp[0], -1); dp[0][s] = 0;
		int x = 0;
		for (int i=0;i<d;i++) {
			fill(dp[1-x], -1);
			for (int j=0;j<=s;j++) if (dp[x][j] >= 0){
				for (int k=0;k<=j;k++) {
					dp[1-x][min(s, j-k+o)] = max(dp[1-x][min(s, j-k+o)], dp[x][j] + dp(k));
				}
			}
//			debug(dp[1-x]);
			x = 1 - x;
		}
		
		int ret = -1;
		for (int i=0;i<=s;i++) ret = max(ret, dp[x][i]);
		
		System.out.println(ret);
	}
	
	int dp(int S) {
		int[][] dp = new int[S+1][u+1];
		for (int[] a : dp) fill(a, -1);
		dp[S][0] = 0;
		
		for (int i=0;i<t;i++) for (int j=0;j<=S;j++) for (int k=0;k<u;k++) if (dp[j][k] >= 0){
			if (j - e[i] >= 0) dp[j-e[i]][k+1] = max(dp[j-e[i]][k+1], dp[j][k] + c[i]);
		}
		if (dp[0][u] < 0) return -1;
		int cal = dp[0][u];
		int[] dp2 = new int[cal+1];
		fill(dp2, -1); dp2[0] = 0;
		
		for (int j=0;j<=cal;j++) for (int i=0;i<n;i++) if (j+a[i] <= cal){
			dp2[j+a[i]] = max(dp2[j+a[i]], dp2[j] + h[i]);
		}
//		debug(cal, dp2);
		int ret = 0;
		for (int i=0;i<=cal;i++) ret = max(ret, dp2[i]);
		return ret;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}