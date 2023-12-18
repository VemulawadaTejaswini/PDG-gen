import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long prime = 1000000007L;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[][] dp = new long[n+1][10];
		dp[0][0] = 1;
		for(int i=0;i<n;i++) {
			dp[i+1][0] = (dp[i][0]*2 + dp[i][2]*2 + dp[i][4]*2 + dp[i][5]*2+ dp[i][7] + dp[i][8] + dp[i][9])%prime; //その他
			dp[i+1][1] = (dp[i][0] + dp[i][1] + dp[i][4] + dp[i][5] + dp[i][6] + dp[i][9])%prime; //A
			dp[i+1][2] = (dp[i][0] + dp[i][2] + dp[i][7] + dp[i][8] + dp[i][9])%prime; //G
			dp[i+1][3] = (dp[i][1] + dp[i][6])%prime; //AG
			dp[i+1][4] = (dp[i][1])%prime; //AC
			dp[i+1][5] = (dp[i][1] + dp[i][6])%prime; //AT
			dp[i+1][6] = (dp[i][2] + dp[i][3] + dp[i][7] + dp[i][8])%prime; //GA
			dp[i+1][7] = (dp[i][3])%prime; //AGG
			dp[i+1][8] = (dp[i][5])%prime; //ATG
			dp[i+1][9] = (dp[i][3])%prime; //AGT
		}
		long ans = 0;
		for(int i=0;i<10;i++) {
			ans += dp[n][i];
		}
		System.out.println(ans%prime);
		in.close();
	}

}
