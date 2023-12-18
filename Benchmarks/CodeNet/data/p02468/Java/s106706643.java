import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Elementary Number Theory - Power
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int m, n;
			m = parseInt(line.substring(0, line.indexOf(' ')));
			n = parseInt(line.substring(line.indexOf(' ') + 1));

			System.out.println(power(m, n));

		}//end while
	}//end main

	static int power(int m, int n) {
		if (n == 0) return 1;
		if (n % 2 == 0) {
			return power(m * m, n / 2) % 1_000_000_007;
		} else {
			return ((power(m * m, n / 2)) * m) % 1_000_000_007;
		}
	}
}