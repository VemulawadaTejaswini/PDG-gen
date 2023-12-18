
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c[] = new int[n+1];
		for(int i=1;i<n;i++) c[i] = sc.nextInt();
		int dp[][][] = new int[2][2][n/2+1];
		
		for(int[][] a: dp) for(int[] b: a) fill(b, INF);
		dp[0][0][0] = 0;
		int x = 1;
		for(int i=1;i<=n;i++, x=1-x) for(int j=0;j<=n/2;j++) {
			dp[x][0][j] = min( dp[1-x][1][j], dp[1-x][0][j] );
			if(j>0)
			dp[x][1][j] = min( dp[1-x][0][j-1] + c[i-1] + c[i],
								 dp[1-x][1][j-1] - c[i-1] + c[i]);
//			debug(dp[i%2][0][j], dp[i%2][1][j]);
		}
		System.out.println( min(dp[1-x][0][n/2], dp[1-x][0][n/2] ) );
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}