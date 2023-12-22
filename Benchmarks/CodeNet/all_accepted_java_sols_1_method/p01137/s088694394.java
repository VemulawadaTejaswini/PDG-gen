/**
 * Space Coconut Grab
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	static final int[] ys = new int[1000001];
	static final int[] zs = new int[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		for (int i = 0; i <= 1000; i++) {
			ys[i * i] = i;
		}
		for (int i = 2; i <= 1000000; i++) {
			if (ys[i] == 0) ys[i] = ys[i - 1];
		}
		for (int i = 0; i <= 100; i++) {
			zs[i * i * i] = i;
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
				for (int y = ys[e - (z * z * z)]; y >= 0; y--) {
					_min += y;
					_min += e - (z * z * z) - (y * y);
					min = Math.min(min, _min);
				}
			}
			System.out.println(min);
		} //end while
	} //end main
}