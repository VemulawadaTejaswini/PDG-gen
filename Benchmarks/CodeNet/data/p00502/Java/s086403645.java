
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), n = sc.nextInt();
		int[] ts = new int[d], abcs[] = new int[n][3];
		
		for(int i=0;i<d;i++) ts[i] = sc.nextInt();
		for(int i=0;i<n;i++)for(int j=0;j<3;j++) abcs[i][j] = sc.nextInt();
		
		int[][] dp = new int[d][n];
		for(int i=0;i<n;i++) if(!(abcs[i][0] <= ts[0] && ts[0] <= abcs[i][1])) dp[0][i] = -INF;
		for(int j=1;j<d;j++) for(int i=0;i<n;i++) {
			if(abcs[i][0] <= ts[j] && ts[j] <= abcs[i][1]) for(int k=0;k<n;k++) 
				dp[j][i] = max(dp[j][i], dp[j-1][k] + abs(abcs[i][2] - abcs[k][2]));
			else dp[j][i] = -INF;
		}
//		debug(dp);
		int max = 0;
		for(int i=0;i<n;i++) max = max(max, dp[d-1][i]);
		System.out.println(max);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}