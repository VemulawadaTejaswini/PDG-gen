/**
 * Space Coconut Grab
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	static final int[] y2 = new int[1001];
	static final int[] z3 = new int[101];
	static final int[] ys = new int[1000001];
	static final int[] zs = new int[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		for (int i = 0; i <= 1000; i++) {
			y2[i] = i * i;
			ys[y2[i]] = i;
		}
		for (int i = 2; i <= 1000000; i++) {
			if (ys[i] == 0) ys[i] = ys[i - 1];
		}
		for (int i = 0; i <= 100; i++) {
			z3[i] = i * i * i;
			zs[z3[i]] = i;
		}
		for (int i = 2; i <= 1000000; i++) {
			if (zs[i] == 0) zs[i] = zs[i - 1];
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int e = parseInt(line);
			if (e == 0) break;

			int min = 1000001;
			for (int z = zs[e]; z >= 0; z--) {
				int _min = 0;
				_min += z;
				for (int y = ys[e - z3[z]]; y >= 0; y--) {
					_min += y;
					_min += e - z3[z] - y2[y];
					min = Math.min(min, _min);
				}
			}
			System.out.println(min);
		} //end while
	} //end main
}