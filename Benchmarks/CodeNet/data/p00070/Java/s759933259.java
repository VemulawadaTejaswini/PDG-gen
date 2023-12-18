import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Combination of Number Sequences
 */
public class Main {

	static int count;
	static int sum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			count = 0;
			sum = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if (sum > 330) {
				System.out.println(0);
			} else {
				solve(0, n, 0);
				System.out.println(count);
			}
		}
	}

	static void solve(int n, int i, int s) {
		if (s > sum) {
			return;
		}
		if (i == 0) {
			if (s == sum) {
				count++;
			}
			return;
		}
		for (int j = 0; j < 10; j++) {
			if ((n & 1 << j) == 0) {
				solve(n | 1 << j, i - 1, s + i * j);
			}
		}
	}
}