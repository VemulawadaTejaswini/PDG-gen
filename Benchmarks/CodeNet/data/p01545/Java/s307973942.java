import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		for(int i=0;i<n;i++) {
			dp[i] = x[i];
			for(int j=0;j<i;j++) {
				if (x[j] < x[i]) {
					dp[i] = Math.max(dp[i], dp[j]+x[i]);
				}
			}
		}
		long ans = 0;
		for(int i=0;i<n;i++) {
			ans = Math.max(ans,dp[i]);
		}
		System.out.println(n*(n+1)/2-ans);
	}
}