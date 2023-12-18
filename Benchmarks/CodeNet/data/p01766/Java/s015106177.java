import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Soccer
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());

		int f, a, t, x, y;
		int _f, _a, _t, _x, _y;

		int LA = -1, FA = -1;
		int LB = -1, FB = -1;

		words = br.readLine().split(" ");

		_f = parseInt(words[0]);
		_a = parseInt(words[1]);
		_t = parseInt(words[2]);
		_x = parseInt(words[3]);
		_y = parseInt(words[4]);

		for (int i = 1; i < N; i++) {

			words = br.readLine().split(" ");

			f = parseInt(words[0]);
			a = parseInt(words[1]);
			t = parseInt(words[2]);
			x = parseInt(words[3]);
			y = parseInt(words[4]);

			if (a != _a && t == _t) {
				int l = (x - _x) * (x - _x) + (y - _y) * (y - _y);
				if (t == 0) {
					if (l > LA) {
						LA = l;
						FA = f - _f;
					} else if (l == LA) {
						FA = Math.min(FA, f - _f);
					}
				} else {
					if (l > LB) {
						LB = l;
						FB = f - _f;
					} else if (l == LB) {
						FB = Math.min(FB, f - _f);
					}
				}
			}

			_f = f;
			_a = a;
			_t = t;
			_x = x;
			_y = y;
		}

		if (FA != -1) {
			System.out.println(Math.sqrt(LA) + " " + ((double) FA) / 60);
		} else {
			System.out.println("-1 -1");
		}

		if (FB != -1) {
			System.out.println(Math.sqrt(LB) + " " + ((double) FB) / 60);
		} else {
			System.out.println("-1 -1");
		}

	}
}