import java.util.Scanner;

public class Main {
	static int DP(int n) {
		int[][] dp = new int[n+1][4];
		for(int i = 0; i < n+1; i++) {
			dp[i][0] = 1;
		}
		dp[0][1] = 1;
		dp[0][2] = 1;
		dp[0][3] = 1;
		
		for(int i = 1; i < n+1; i++)
			for(int j = 1; j < 4; j++) {
				dp[i][j] = dp[i][j-1] + dp[i-1][j];
			}
		
		return dp[n][3];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(DP(n));
		}
	}
}

