import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Carpenters' Language
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int q = parseInt(br.readLine());

		long lp = 0, rp = 0;

		for (int i = 0; i < q; i++) {

			words = br.readLine().split(" ");

			long n;
			char c;
			c = words[1].charAt(0);
			n = parseLong(words[2]);

			if (c == '(') lp += n;
			else rp += n;

			if (lp == rp) System.out.println("Yes");
			else System.out.println("No");

		}
	}
}