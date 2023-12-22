import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ins = br.readLine().split(" ");
		int h = Integer.parseInt(ins[0]), w = Integer.parseInt(ins[1]);
		char tb[][] = new char[h][w];
		for ( int r = 0; r < h; r++ ) {
			char[] temp = br.readLine().toCharArray();
			tb[r] = temp;
		}
		br.close();

		int dp[][] = new int[h + 1][w + 1];
		dp[1][1] = 1;
		//		for ( int r = 0; r < h; r++ ) {
		//			if ( tb[r][0] == '#' ) break;
		//			dp[r][0] = 1;
		//		}
		//		for ( int c = 0; c < w; c++ ) {
		//			if ( tb[0][c] == '#' ) break;
		//			dp[0][c] = 1;
		//		}

		for ( int r = 1; r <= h; r++ ) {
			for ( int c = 1; c <= w; c++ ) {
				if ( tb[r - 1][c - 1] == '#' ) continue;
				dp[r][c] += (dp[r - 1][c] + dp[r][c - 1]) % mod;
			}
		}
		System.out.println(dp[h][w] % mod);
	}
}
