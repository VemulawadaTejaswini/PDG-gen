import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
      
		int mod = (int) 1E9 + 7;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		long dp[][] = new long[s.length][13];

		if ( s[0] == '?' ) {
			for ( int n = 0; n < 10; n++ ) {
				dp[0][n] = 1;
			}
		} else {
			dp[0][s[0] - '0'] = 1;
		}

		for ( int i = 1; i < s.length; i++ ) {
			for ( int r = 0; r < 13; r++ ) {
				if ( s[i] != '?' ) {
					int now = s[i] - '0';
					dp[i][(r * 10 + now) % 13] += dp[i - 1][r];
				}
				else {
					for ( int now = 0; now < 10; now++ ) {
						dp[i][(r * 10 + now) % 13] += dp[i - 1][r];
					}
				}
			}

			for ( int t = 0; t < 13; t++ ) {
				dp[i][t] %= mod;
			}
		}
		System.out.println(dp[s.length - 1][5]);
		br.close();
	}
}
