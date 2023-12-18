
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[][] l, s;
	int[][][] ls;
	int[] z;
	int r, n, m;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt(); m = sc.nextInt();
			if( (n|m) == 0 ) break;
			l = new int[n][n];
			s = new int[n][n];
			for(int[] a: l) fill(a, INF);
			for(int[] a: s) fill(a, INF);
			for(int i=0;i<n;i++) l[i][i] = s[i][i] = 0;
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1, b = sc.nextInt() - 1, d = sc.nextInt();
				if( sc.next().equals("S") ) s[a][b] = s[b][a] = min(s[a][b], d);
				else l[a][b] = l[b][a] = min(l[a][b], d);
			}
			
			for(int k=0;k<n;k++) for(int i=0;i<n;i++) for(int j=0;j<n;j++) {
				s[i][j] = min(s[i][j], s[i][k]+s[j][k]);
				l[i][j] = min(l[i][j], l[i][k]+l[j][k]);
			}
//			debug(s);
//			debug(l);
			r = sc.nextInt();
			z = new int[r];
			for(int i=0;i<r;i++) z[i] = sc.nextInt()-1;
			System.out.println(dp());
		}
	}
	
	int dp() {
		int dp[][] = new int[r][n];
		for(int[] a: dp) fill(a, INF);
		dp[0][z[0]] = 0;
		for(int k=0;k<r-1;k++) for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) dp[k+1][j] = min(dp[k+1][j], dp[k][i] + l[z[k]][i] + s[i][j] + l[j][z[k+1]]);
			dp[k+1][i] = min(dp[k+1][i], dp[k][i] + l[z[k]][z[k+1]]);
		}
		
		int min = INF;
		for(int i=0;i<n;i++) min = min(min, dp[r-1][i]);
		return min;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}