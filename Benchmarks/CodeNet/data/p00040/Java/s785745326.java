import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Affine Cipher
 */
public class Main {

	static final char[][] hints = {{'t', 'h', 'i', 's'}, {'t', 'h', 'a', 't'}};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			int[] c = cipher(s);
			char[] d = new char['z' + 1];
			for (int j = 0; j < 26; j++) {
				d[(char) (((c[0] * j + c[1]) % 26) + 'a')] = (char) (j + 'a');
			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ' ') {
					sb.append(' ');
				} else {
					sb.append(d[s.charAt(j)]);
				}
			}
			System.out.println(sb.toString());
		}
	}

	static int[] cipher(String s) {

		int[] ret = new int[2];

		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {

			String w = st.nextToken();

			if (w.length() == 4) {

				char[] hint;

				if (w.charAt(0) != w.charAt(w.length() - 1)) {
					hint = hints[0];
				} else {
					hint = hints[1];
				}

				for (int a = 0; a < 26; a++) {
					if (a % 2 != 0 && a % 13 != 0) {
						for (int b = 0; b < 26; b++) {
							String h = "";
							for (int i = 0; i < hint.length; i++) {
								h += (char) (((a * (hint[i] - 'a') + b) % 26) + 'a');
							}
							if (w.equals(h)) {
								ret[0] = a;
								ret[1] = b;
								return ret;
							}
						}
					}
				}
			}
		}

		return ret;
	}
}