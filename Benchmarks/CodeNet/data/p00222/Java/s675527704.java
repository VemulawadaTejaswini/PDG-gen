import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Problem G: Prime Quadruplet
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		boolean[] ps = primes(1_000_000);

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int i = n;
			while (i >= 13) {
				if (ps[i]) if (ps[i - 2] && ps[i - 6] && ps[i - 8]) break;
				i--;
			}
			System.out.println(i);

		}//end while
	}//end main

	static boolean[] primes(int limit) {

		boolean[] ps = new boolean[limit + 1];
		int _limit = (int) Math.ceil(Math.sqrt(ps.length));

		Arrays.fill(ps, 2, ps.length, true);

		for (int i = 2; i <= _limit; i++) {
			if (ps[i]) {
				for (int j = i * 2; j < ps.length; j += i) {
					if (ps[j]) ps[j] = false;
				}
			}
		}
		return ps;
	}
}