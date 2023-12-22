import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuffer sb = new StringBuffer(S);
		char[] s = sb.reverse().toString().toCharArray();
		int N = S.length();
		long[][] dp = new long[N+1][13];
		int[] m = {1, 10, 9, 12, 3, 4};
		if(s[0] == '?') {
			for(int i = 0; i < 10; i++)
				dp[1][i] = 1;
		}
		else
			dp[1][Character.getNumericValue(s[0])] = 1;
		for(int i  = 1; i < N; i++) {
			if(s[i] != '?') {
				int a = Character.getNumericValue(s[i]) * m[i%6] % 13;
				for(int j = 0; j < 13; j++) {
					dp[i+1][(j+a) % 13] += dp[i][j];
				}
			}
			else {
				for(int j = 0; j < 10; j++) {
					int a = j * m[i%6] % 13;
					for(int k = 0; k < 13; k++) {
						dp[i+1][(k+a) % 13] += dp[i][k];
					}
				}
			}
			for(int j = 0; j < 13; j++)
				dp[i+1][j] %= 1000000007;
		}
		System.out.println(dp[N][5]);

	}

}