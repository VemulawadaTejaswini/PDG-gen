
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 29;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt(), m = sc.nextInt();
			if ((n|m) == 0) break;
			
			int[] c = new int[m], x = new int[n];
			for (int i=0;i<m;i++) c[i] = sc.nextInt();
			for (int i=0;i<n;i++) x[i] = sc.nextInt();
			
			int[][] dp = new int[n+1][256];
			for (int[] a : dp) fill(a, INF);
			
			dp[0][128] = 0;
			
			for (int i=0;i<n;i++) for (int j=0;j<256;j++) {
				for (int k=0;k<m;k++) {
					int next = j + c[k];
					if (next < 0) next = 0;
					if (next > 255) next = 255;
					dp[i+1][next] = min(dp[i+1][next], dp[i][j] + (next - x[i]) * (next - x[i]));
				}
			}
			
			int min = INF;
			for (int i=0;i<256;i++) min = min(min, dp[n][i]);
			System.out.println(min);
		}

	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}