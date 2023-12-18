import java.io.IOException;
import java.util.Scanner;
public class Main {

	static int mod = (int) 1E9 + 7;

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();

		// i文字目までを13で割った余りがｊであるものの個数を格納する
		long dp[][] = new long[s.length][13];

		// 初期値
		if ( s[0] == '?' ) {
			for ( int n = 0; n < 10; n++ ) {
				dp[0][n] = 1;
			}
		} else {
			dp[0][s[0] - '0'] = 1;
		}

		// 1文字づつ見ていく
		for ( int i = 1; i < s.length; i++ ) {

			if ( s[i] == '?' ) {
				for ( int t = 0; t < 13; t++ ) {
					for ( int n = 0; n < 10; n++ ) {
						dp[i][(t * 10 + n) % 13] += dp[i - 1][t];
					}
				}
			} else {
				int now = s[i] - '0';
				for ( int t = 0; t < 13; t++ ) {
					dp[i][(t * 10 + now) % 13] += dp[i - 1][t];
				}
			}
			
			for ( int t = 0; t < 13; t++ ) {
				dp[i][t] %= mod;
			}
		}
				
		System.out.println(dp[s.length-1][5]);
		in.close();
	}
}