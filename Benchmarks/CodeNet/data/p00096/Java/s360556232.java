
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
		int[][] dp = new int[4001][5];
		dp[0][0] = 1;
		for(int i=1;i<=4;i++) for(int j=0;j<=4000;j++) for(int k=0;k<=1000;k++) 
			if(j+k<=4000) dp[j+k][i] += dp[j][i-1];
		for(;sc.hasNext();) {
			System.out.println(dp[sc.nextInt()][4]);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}