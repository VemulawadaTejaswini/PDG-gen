import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static int[] dp = new int[1000001];
	static int[] dp2 = new int[1000001];	
	public static void main(String[] args) {
		
		fill(dp, 100000000);
		fill(dp2, 100000000);
		dp[0] = dp2[0] = 0;
		dp[1] = dp2[1] = 1;
		for (int i = 1; i <= 1000000; i++) {
			for (int j = 1; ; j++) {
				int a = f(j);
				int b = i - a;
				if (b < 0) break;
				dp[i] = min(dp[i], 1 + dp[b]);
				if (a % 2 == 1)
					dp2[i] = min(dp2[i], 1 + dp2[b]);
			}
		}
		while (read())
			solve();
	}
	
	static int N;
	static boolean read() {
		N = sc.nextInt();
		if (N == 0) return false;
		return true;
	}

	static void solve() {
		System.out.println(dp[N] + " " + dp2[N]);
	}


	static int f(int n) {
		return n * (n + 1) * (n + 2) / 6;
	}
}