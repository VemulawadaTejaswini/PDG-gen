
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
		long[][][] dp = new long[100+2][10][1000+2]; dp[0][0][0] = 1;
		for(int i=0;i<=100;i++) for(int j=0;j<9;j++) for(int k=0;k<=1000;k++) {
			dp[i+1][j][k] += dp[i][j][k];
			if(i+k<=1000) dp[i+1][j+1][k+i] += dp[i][j][k];
		}
		for(;;) {
			int n = sc.nextInt(), s = sc.nextInt();
			if((n|s) == 0) break;
			System.out.println(dp[101][n][s]);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}