import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] dp = new int[n];
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			dp[i] = -1;
		}
		dp[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; i+j < n && j <= k; j++) {
				if(dp[i+j] < 0) {
					dp[i+j] = dp[i] + Math.abs(h[i]-h[i+j]);
				}else {
					dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(h[i]-h[i+j]));
				}
			}
		}
		System.out.println(dp[n-1]);
		sc.close();
	}

}