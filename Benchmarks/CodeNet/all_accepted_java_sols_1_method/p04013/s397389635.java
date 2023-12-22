import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = sc.nextInt();
		}
		long[][][] dp = new long[n + 1][n + 1][50 * 50 + 1];
		dp[0][0][0] = 1;
		for (int i = 1; i <= n; i++) {
		    for (int j = 0; j < i; j++) {
		        for (int k = 0; k <= j * 50; k++) {
		            dp[i][j][k] += dp[i - 1][j][k];
		            dp[i][j + 1][k + arr[i]] = dp[i - 1][j][k];
		        }
		    }
		}
		long total = 0;
		for (int i = 1; i <= n; i++) {
		    total += dp[n][i][i * a];
		}
		System.out.println(total);
	}
}
