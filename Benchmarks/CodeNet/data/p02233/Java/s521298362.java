import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int n;
	private static int[] dp;
	
	public static void main(String[] args) {
		initialize();
		solve();
	}
	
	private static void initialize() {
		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
		}
		dp = new int[44+1];
		Arrays.fill(dp, -1);
	}
	
	private static void solve() {
		System.out.println(fibonacci(n));
	}
	
	private static int fibonacci(int i) {
		if(dp[i] != -1) return dp[i];
		if(i == 0 || i == 1) return dp[i] = 1;
		return dp[i] = fibonacci(i-1) + fibonacci(i-2);
	}
}

