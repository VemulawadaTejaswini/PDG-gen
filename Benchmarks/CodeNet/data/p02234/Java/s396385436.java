import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_10_B
 * 
 * @author Kyoro
 *
 */
public class Main {

	BufferedReader reader;
	private int n;
	private int r[];
	private int c[];
	private long dp[][];

	public Main() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
		Main main = new Main();
		try {
			main.read();
			long result = main.solve();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void init(int n) {
		dp = new long[n][n];
		r = new int[n];
		c = new int[n];
	}

	private void read() throws IOException {
		String line = reader.readLine();
		String tokens[];
		n = Integer.parseInt(line.trim());
		init(n);
		for (int i = 0; i < n; i++) {
			line = reader.readLine();
			tokens = line.trim().split(" ");
			r[i] = Integer.parseInt(tokens[0]);
			c[i] = Integer.parseInt(tokens[1]);
		}
	}

	private long solve() {
		for (int i = 0; i < n; i++) {
			dp[i][i] = 0;
		}
		for (int j = 1; j < n; j++) {
			for (int i = j - 1; i >= 0; i--) {
				// i <= k < j となるすべてのkで分割を試す
				dp[i][j] = 100000000;
				for (int k = i; k < j; k++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j]+ (r[i] * c[k] * c[j]));
				}
			}
		}

		return dp[0][n - 1];
	}

}

