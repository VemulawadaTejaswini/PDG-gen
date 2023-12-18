import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int C = 1;
	public static void main(String[] args) {
		for (C = 1; read(); C++)
			solve();
	}
	
	static int W, N;
	static int[] w = new int[1000], v = new int[1000];
	static boolean read() {
		W = sc.nextInt();
		if (W == 0) return false;
		N = sc.nextInt();
		String[] str;
		for (int i = 0; i < N; i++) {
			str = sc.next().split(",");
			v[i] = Integer.parseInt(str[0]);
			w[i] = Integer.parseInt(str[1]);
		}
		return true;
	}

	static void solve() {
		int[][] dp = new int[N + 1][W + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= W; j++) {
				if (j >= w[i - 1]) {
					dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		int wt = 0, val = 0;
		for (int i = 0; i <= W; i++) {
			if (val < dp[N][i]) {
				wt = i; val = dp[N][i];
			}
		}
		System.out.println("Case " + C + ":");
		System.out.println(val);
		System.out.println(wt);
	}	
}