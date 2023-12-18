import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Combination of Number Sequences
 */
public class Main {

	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int s = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			count = 0;
			solve(0, n, 1, s);
			System.out.println(count);

		}

	}

	static void solve(int p, int n, int a, int s) {

		if (p > 9 || n <= 0 || p * a > s) {
			return;
		}

		if (n == 1 && p * a == s) {
			++count;
		} else {
			solve(p + 1, n - 1, a + 1, s - p * a);
			solve(p + 1, n, a, s);
		}
	}
}