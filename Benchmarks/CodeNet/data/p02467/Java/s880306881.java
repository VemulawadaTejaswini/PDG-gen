import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Elementary Number Theory - Prime Factorize
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);

			StringBuilder sb = new StringBuilder();
			sb.append(n + ":");

			int d = 2;
			while (n != 1) {
				if (n % d == 0) {
					sb.append(" " + d);
					n /= d;
				} else {
					while (!isPrime(d)) d++;
				}
			}
			System.out.println(sb.toString());

		}//end while
	}//end main

	static boolean isPrime(int n) {
		if (n == 2) return true;
		if (n < 2 || n % 2 == 0) return false;

		int i = 3;
		while (i <= Math.sqrt(n)) {
			if (n % i == 0) return false;
			else i += 2;
		}
		return true;
	}

}