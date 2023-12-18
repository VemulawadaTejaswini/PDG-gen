import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static int[] dp = new int[1000001];
	static int[] dp2 = new int[1000001];
	public static void main(String[] args) {
		fill(dp, -1);
		fill(dp2, -1);
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
		System.out.println(rec(N) + " " + rec2(N));
	}
	
	static int rec(int v) {
		if (v <= 0) return 0;
		else if (v == 1) return 1;
		else if (dp[v] != -1) {
			return dp[v];
		}
		int ret = Integer.MAX_VALUE;
		for (int i = 1; ; i++) {
			int a = f(i);
			int b = v - a;
			if (b < 0) break;
			ret = min(ret, 1 + rec(b));
		}
		dp[v] = ret;
		return ret;
	}
	
	static int rec2(int v) {
		if (v <= 0) return 0;
		else if (v == 1) return 1;
		else if (dp2[v] != -1) {
			return dp2[v];
		}
		int ret = Integer.MAX_VALUE;
		for (int i = 1; ; i++) {
			int a = f(i);
			int b = v - a;
			if (a % 2 == 0) continue;
			if (b < 0) break;
			ret = min(ret, 1 + rec2(b));
		}
		dp2[v] = ret;
		return ret;
	}


	static int f(int n) {
		return n * (n + 1) * (n + 2) / 6;
	}
}