
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int[] p, t;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			p = new int[n+1]; t = new int[n+1];
			for(int i=1;i<=n;i++) {p[i] = sc.nextInt(); t[i] = sc.nextInt();}
			
			int[][] dp = new int[n+1][4];
			for(int[] a: dp) fill(a, INF);
			dp[0][0] = 0;
			int i;
			for(i=1;i<=n;i++) {
				for(int j=0;j<4;j++) dp[i][1] = min(dp[i][1], dp[i-1][j] + ( p[i-1] * (j+1) + p[i] <= t[i] - t[i-1]? p[i-1] + p[i]: INF) );
				for(int j=2;j<4;j++) dp[i][j] = min(dp[i][j], dp[i-1][j-1] + (abs(p[i]-p[i-1]) * j <= t[i] - t[i-1]? abs(p[i]-p[i-1]): INF));
				boolean flg = true;
				for(int j=0;j<4;j++) flg &= dp[i][j] == INF;
				if(flg) break;
			}
		
			if(i != n+1) {
				System.out.println("NG " + i);
				continue;
			}
			int ans = INF;
			for(i=0;i<4;i++) ans = min( dp[n][i], ans);
			ans += p[n];
			System.out.println("OK " + ans);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}