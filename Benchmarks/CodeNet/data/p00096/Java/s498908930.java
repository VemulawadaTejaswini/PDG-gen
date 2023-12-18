import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] dp = new int[4001][4];
		for(int i = 0; i < 4001; i++) {
			dp[i][0] = 1;
		}
		dp[0][1] = 1;
		dp[0][2] = 1;
		dp[0][3] = 1;
		
		for(int i = 1; i < 4001; i++)
			for(int j = 1; j < 4; j++) {
				dp[i][j] = dp[i][j-1] + dp[i-1][j];
			}
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(dp[n][3]);
		}
	}
}

