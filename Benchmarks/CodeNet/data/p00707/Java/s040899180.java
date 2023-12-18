import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * The Secret Number
 */
public class Main {

	static char[][] seq;
	static SortedMap<Integer, SortedSet<String>> num;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int W, H;
			W = parseInt(line.substring(0, line.indexOf(' ')));
			H = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((W | H) == 0) break;

			seq = new char[H + 2][W + 2];

			for (int i = 0; i < seq.length; i++) {
				Arrays.fill(seq[i], 'X');
			}

			for (int i = 0; i < H; i++) {
				line = br.readLine();
				for (int j = 0; j < W; j++) {
					char c = line.charAt(j);
					seq[i + 1][j + 1] = (c > '9' ? 'X' : c);
				}
			}

			num = new TreeMap<>();
			char[] buf = new char[H + W - 1];

			for (int i = 1; i <= H; i++) {
				for (int j = 1; j <= W; j++) {
					if (seq[i][j] != 'X'
							&& seq[i - 1][j] == 'X'
							&& seq[i][j - 1] == 'X') {
						dfs(new int[]{i, j}, 0, buf.clone());
					}
				}
			}
			System.out.println(num.get(num.lastKey()).last());

		} //end while
	} //end main

	static void dfs(int[] p, int i, char[] buf) {
		if (seq[p[0]][p[1]] == 'X') {
			num.putIfAbsent(i, new TreeSet<>());
			num.get(i).add(String.valueOf(buf, 0, i));
			return;
		}
		//
		if (i == 0 && seq[p[0]][p[1]] == '0') {
			i--;
		} else {
			buf[i] = seq[p[0]][p[1]];
		}
		if (seq[p[0] + 1][p[1] - 1] == 'X') {
			dfs(new int[]{p[0] + 1, p[1]}, i + 1, buf.clone());
		}
		if (seq[p[0] - 1][p[1] + 1] == 'X') {
			dfs(new int[]{p[0], p[1] + 1}, i + 1, buf.clone());
		}
	}
}