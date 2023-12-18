import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Shopping
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, m;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		if (m == 0) {
			System.out.println(N + 1);
			return;
		}

		int[] shops = new int[N + 1];

		for (int i = 0; i < m; i++) {
			line = br.readLine();
			int c, d;
			c = parseInt(line.substring(0, line.indexOf(' ')));
			d = parseInt(line.substring(line.indexOf(' ') + 1));
			shops[c]++;
			shops[d]--;
		}

		int zero = 0;

		for (int i = 1; i < shops.length; i++) {
			shops[i] += shops[i - 1];
			if (shops[i] == 0) zero++;
		}

		System.out.println(zero + (N + 1 - zero) * 3);

	}
}