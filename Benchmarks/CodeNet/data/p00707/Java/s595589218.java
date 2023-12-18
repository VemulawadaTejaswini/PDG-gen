import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * The Secret Number
 */
public class Main {

	static char[][] num;
	static int[][] len;
	static String max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int W, H;
			W = parseInt(line.substring(0, line.indexOf(' ')));
			H = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((W | H) == 0) break;

			num = new char[H + 2][W + 2];
			len = new int[H + 2][W + 2];

			for (int i = 0; i < num.length; i++) {
				Arrays.fill(num[i], 'X');
			}

			max = "";

			for (int i = 1; i <= H; i++) {
				line = br.readLine();
				for (int j = 1; j <= W; j++) {
					char c = line.charAt(j - 1);
					num[i][j] = (c <= '9' ? c : 'X');
				}
			}

			//
			for (int i = 1; i <= H; i++) {
				for (int j = 1; j <= W; j++) {
					if (num[i][j] != 'X' && len[i][j] == 0) {
						solve(i, j, "");
					}
				}
			}

			System.out.println(max);

		} //end while
	} //end main

	static void solve(int y, int x, String s) {

		if (!(s.equals("") && num[y][x] == '0')) {
			s += num[y][x];
			if (s.length() >= len[y][x]) {
				len[y][x] = s.length();
			} else {
				return;
			}
		}

		if (num[y + 1][x] == 'X' && num[y][x + 1] == 'X') {
			if (max.length() < s.length()) {
				max = s;
			} else if (max.length() == s.length()) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) > max.charAt(i)) {
						max = s;
						break;
					} else if (s.charAt(i) < max.charAt(i)) {
						break;
					}
				}
			}
			return;
		}

		if (num[y + 1][x] != 'X') solve(y + 1, x, s);
		if (num[y][x + 1] != 'X') solve(y, x + 1, s);
	}
}