import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Pair of Primes
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		boolean[] primes = primeB(10000);

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			int count = 0;

			for (int i = 1, j = N; i <= N; i++, j--) {
				if (primes[i] && primes[j]) count++;
			}

			System.out.println(count);
		}
	}

	static boolean[] primeB(int n) {

		boolean[] ret = new boolean[n + 1];
		int _n = (int) Math.sqrt(ret.length);

		//2..
		Arrays.fill(ret, 2, ret.length, true);

		for (int i = 2; i <= _n; i++) {
			if (ret[i]) {
				for (int j = i + i; j < ret.length; j += i) {
					if (ret[j]) ret[j] = false;
				}
			}
		}
		return ret;
	}
}