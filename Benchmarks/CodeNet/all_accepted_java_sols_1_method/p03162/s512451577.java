import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] hap = new int[n][3];
		long[][] dp = new long[n+10][3];
		for(int i = 0; i < n; i++) {
			hap[i][0] = sc.nextInt();
			hap[i][1] = sc.nextInt();
			hap[i][2] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(j == k) continue;
					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][k] + hap[i][j]);
					//System.out.println(dp[i+1][j]);
				}
			}
		}
		long max = 0;
		for(int i = 0; i < 3; i++) {
			if(dp[n][i] > max) {
				max = dp[n][i];
			}
		}
		System.out.println(max);
	}
}