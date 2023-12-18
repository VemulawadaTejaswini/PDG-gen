import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Jogging
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			long[] ds = new long[n];
			long[] vs = new long[n];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				ds[i] = parseInt(line.substring(0, line.indexOf(' ')));
				vs[i] = parseInt(line.substring(line.indexOf(' ') + 1));
			}

			//solve
			long D = vs[0];
			for (int i = 1; i < n; i++) D = lcm(D, vs[i]);

			for (int i = 0; i < n; i++) ds[i] *= D / vs[i];

			long N = ds[0];
			for (int i = 1; i < n; i++) N = lcm(N, ds[i]);

			for (int i = 0; i < n; i++) System.out.println(N / ds[i]);
		}
	}

	static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}
}