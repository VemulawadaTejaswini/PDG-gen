import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.parseInt;

/**
 * Substring
 */
public class Main {

	static final int BASE = 1_000_000_007;

	static char[] s;
	static final String Li = "L++";
	static final String Ld = "L--";
	static final String Ri = "R++";
	static final String Rd = "R--";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

//		long st, et;
//		st = System.nanoTime();

		line = br.readLine();
		int n, m;
		n = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		s = br.readLine().toCharArray();
		int l = 0, r = 0;
		int hash = (int) s[0];
		Set<Integer> hashs = new HashSet<>();

		//parse
		int count = 0;
		for (int i = 0; i < m; i++) {
			switch (br.readLine()) {
				case Li:
					hash -= s[l] * power(BASE, r - l);
					l++;
					break;
				case Ld:
					l--;
					hash += s[l] * power(BASE, r - l);
					break;
				case Ri:
					r++;
					hash = hash * BASE + s[r];
					break;
				case Rd:
					hash = (hash - s[r]) / BASE;
					r--;
					break;
			}
			hashs.add(hash);
		}
		System.out.println(hashs.size());

//		et = System.nanoTime();
//		System.out.println((et - st) / 1000 / 1000);
	}

	static int power(int m, int n) {
		if (n == 0) return 1;
		if (n % 2 == 0) {
			return power(m * m, n / 2);
		} else {
			return power(m * m, n / 2) * m;
		}
	}
}