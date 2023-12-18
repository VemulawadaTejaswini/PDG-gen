import java.util.*;
public class Main {
	public static void main(String[] args) {
		int MOD = 10007;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[][] dp = new int[n+1][8]; dp[0][1] = 1;
		for (int i=0;i<n;i++) for (int j=1, p = s.charAt(i) != 'J' ? s.charAt(i) != 'O' ? 2 : 1 : 0;j<8;j++) {
			if (((j>>p)&1) == 0 ) continue;
			for (int l=1;l<8;l++) {
				if ((j&l) == 0) continue;
				dp[i+1][j] = (dp[i+1][j] + dp[i][l]) % MOD;
			}
		}
		int sum = 0;
		for (int i=1;i<8;i++) sum = (sum+dp[n][i]) % MOD;
		System.out.println(sum);
	}
}