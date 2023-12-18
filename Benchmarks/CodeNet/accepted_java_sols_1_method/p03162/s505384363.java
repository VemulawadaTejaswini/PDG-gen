import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		long[][] dp = new long[n][3];
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		
		for (int i = 1; i < n; i++) {
			dp[i][0] = a[i] + Math.max(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = b[i] + Math.max(dp[i - 1][2], dp[i - 1][0]);
			dp[i][2] = c[i] + Math.max(dp[i - 1][0], dp[i - 1][1]);
		}
		
		long max = 0;
		for (int i = 0; i < 3; i++)
			max = Math.max(max, dp[n - 1][i]);
		
		System.out.println(max);
				
		sc.close();
	}
}

