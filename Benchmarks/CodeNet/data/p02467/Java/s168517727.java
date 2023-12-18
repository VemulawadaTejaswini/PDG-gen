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
					if (d == 2) d = 3;
					else d += 2;
				}
			}
			System.out.println(sb.toString());

		}//end while
	}//end main
}