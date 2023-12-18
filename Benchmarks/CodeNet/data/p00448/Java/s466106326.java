import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Osenbei
 * JOI 7th, Pre 5
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int R, C;
			R = parseInt(st.nextToken());
			C = parseInt(st.nextToken());
			if ((R | C) == 0) break;

			int[] CR = new int[C];

			for (int i = 0; i < R; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < C; j++) {
					if (st.nextToken().equals("1")) CR[j] |= 1 << i;
				}
			}

			//solve
			int max = 0;

			for (int i = 0; i < 1 << R; i++) {
				int[] _CR = new int[C];
				for (int j = 0; j < C; j++) {
					_CR[j] = CR[j];
				}
				int flip = 0;
				for (int j = 0; j < R; j++) {
					if ((i >> j & 1) == 1) flip |= 1 << j;
				}
				//
				int count = 0;
				for (int j = 0; j < C; j++) {
					int bits = bits(_CR[j] ^ flip, R);
					count += (bits > R - bits ? bits : R - bits);
				}
				max = Math.max(max, count);
			}

			System.out.println(max);
		}
	}

	static int bits(int b, int size) {
		int ret = 0;
		for (int i = 0; i < size; i++) {
			if ((b >> i & 1) == 1) ret++;
		}
		return ret;
	}
}