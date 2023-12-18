import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		long[][] dp = new long[n-1][21];
		for(int j=0;j<=20;j++) {
			dp[0][j] = 0;
		}
		dp[0][a[0]] = 1;
		for(int i=1;i<n-1;i++) {
			for(int j=0;j<=20;j++) {
				if(j-a[i]>=0) dp[i][j] += dp[i-1][j-a[i]];
				if(j+a[i]<=20) dp[i][j] += dp[i-1][j+a[i]];
			}
		}
		System.out.println(dp[n-2][a[n-1]]);
	}	
	
}



