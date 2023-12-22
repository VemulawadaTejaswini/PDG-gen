import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n];
		int[] frog = new int[n];
		for(int i=0; i<n; i++) {
			frog[i] = sc.nextInt();
		}
		for(int i=1; i<n; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<i+3; j++) {
				if(j<n) dp[j] = Math.min(dp[j],dp[i]+ Math.abs(frog[i]-frog[j]));
			}
		}
		System.out.println(dp[n-1]);

	}

}
