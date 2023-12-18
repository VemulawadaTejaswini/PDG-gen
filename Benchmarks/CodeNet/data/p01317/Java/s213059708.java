
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	//int INF = 1 << 28;
	long INF = 1L << 60;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			//input
			int n = sc.nextInt(), m = sc.nextInt();
			if ((n|m) == 0) break;
			
			long[][] s = new long[n][n], l = new long[n][n];
			for (int i=0;i<n;i++) {
				fill(s[i], INF);
				fill(l[i], INF);
				s[i][i] = l[i][i] = 0;
			}
			
			for (int i=0;i<m;i++) {
				int x = sc.nextInt()-1, y = sc.nextInt()-1, t = sc.nextInt();
				char sl = sc.next().charAt(0);
				if (sl == 'S')	s[x][y] = s[y][x] = min(s[x][y], t);
				else 			l[x][y] = l[y][x] = min(l[x][y], t);
			}

			int r = sc.nextInt();
			int[] ps = new int[r];
			for (int i=0;i<r;i++) ps[i] = sc.nextInt()-1;
			
			// WF
			for (int k=0;k<n;k++) for (int i=0;i<n;i++) for (int j=0;j<n;j++) {
				s[i][j] = min(s[i][j], s[i][k] + s[k][j]);
				l[i][j] = min(l[i][j], l[i][k] + l[k][j]);
			}

			long[][] dp = new long[r][n];
			for (long[] a : dp) fill(a, INF); dp[0][ps[0]] = 0;
			
			for (int i=1;i<r;i++) for (int j=0;j<n;j++) {
				dp[i][j] = min(dp[i][j], dp[i-1][j] + l[ps[i-1]][ps[i]]);
				for (int k=0;k<n;k++) 
					dp[i][j] = min(dp[i][j], dp[i-1][k] + l[ps[i-1]][k] + s[k][j] + l[j][ps[i]]);
			}

			long ans = INF;
			for (int i=0;i<n;i++) ans = min(ans, dp[r-1][i]);
			
			System.out.println(ans);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}