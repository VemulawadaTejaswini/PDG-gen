import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
	int INF = 1<<28;
	int N = 220;
	void run() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if( (n|m) == 0) break;
			
			int[][] l = new int[N][N]; for(int[] a: l) fill(a, INF);
			int[][] s = new int[N][N]; for(int[] b: s) fill(b, INF);
			
			for(int i=0;i<n;i++) {
				l[i][i] = s[i][i] = 0;
			}
			
			for(int i=0;i<m;i++) {
				int x = sc.nextInt()-1, y = sc.nextInt()-1, t = sc.nextInt();
				String sl = sc.next();
				if(sl.charAt(0) == 'L') l[x][y] = l[y][x] = min(l[x][y], t);
				else s[x][y] = s[y][x] = min(s[x][y], t);
			}

			for(int k=0;k<n;k++) for(int i=0;i<n;i++) for(int j=0;j<n;j++) {
				l[i][j] = min(l[i][j], l[i][k] + l[k][j]);
				s[i][j] = min(s[i][j], s[i][k] + s[k][j]);
			}
			
			int R = sc.nextInt();
			int r[] = new int[R];
			for(int i=0;i<R;i++) r[i] = sc.nextInt()-1;
			
			int[][] dp = new int[R][N]; for(int[] a: dp) fill(a, INF);
			dp[0][r[0]] = 0;
			
			for(int i=0;i<R-1;i++) for(int j=0;j<n;j++) { //ship now
				dp[i+1][j] = min(dp[i+1][j], dp[i][j] + l[r[i]][r[i+1]]);
				for(int k=0;k<n;k++) { //ship next
					dp[i+1][k] = min(dp[i+1][k], dp[i][j] + l[r[i]][j] + s[j][k] + l[k][r[i+1]]);
				}
			}
			
//			for(int[] a: l)debug(a);
//			for(int[] a: s)debug(a);
//			for(int[] a: dp)debug(a);
			
			int ans = INF;
			for(int i=0;i<n;i++) ans = min(ans, dp[R-1][i]);
			System.out.println(ans);
		} 
	}
	
	void debug(Object...os) {
		System.err.println(deepToString(os));
	}
	
	public static void main(String[] args ) {
		new Main().run();
	}
}