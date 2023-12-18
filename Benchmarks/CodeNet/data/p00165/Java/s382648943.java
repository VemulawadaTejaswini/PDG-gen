import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Lottery
 */
public class Main {

	static final int MAX = 1_000_000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		//primes
		boolean[] ps = primes(MAX);
		int[] count = new int[ps.length];
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i - 1] + (ps[i] ? 1 : 0);
		}


		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int sum = 0;
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int p, m, s, t;
				p = parseInt(line.substring(0, line.indexOf(' ')));
				m = parseInt(line.substring(line.indexOf(' ') + 1));
				s = p - m - 1;
				t = p + m;
				if (p - m - 1 < 0) s = 1;
				if (p + m > MAX) t = MAX;
				sum += count[t] - count[s] - 1;
			}
			System.out.println(sum);

		} //ene while
	}//end main

	static boolean[] primes(int limit) {

		boolean[] ps = new boolean[limit + 1];
		int _limit = (int) Math.sqrt(ps.length) + 1;

		//2..
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