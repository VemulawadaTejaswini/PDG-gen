import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		long[] dp = new long[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			dp[i] = 9223372036854775807l;
		}
		
		dp[0] = 0;
		for(int i = 1;i < n; i++) {
			for(int m = 1; m < k+1; m++) {
				if(i >= m )dp[i] = Math.min(dp[i], dp[i-m] + Math.abs(h[i] - h[i - m]));
			}
		}
		System.out.println(dp[n - 1]);
	}
}