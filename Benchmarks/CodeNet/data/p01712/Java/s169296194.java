import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Koto Distance
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		words = br.readLine().split(" ");
		int N, W, H;
		N = parseInt(words[0]);
		W = parseInt(words[1]);
		H = parseInt(words[2]);

		int[] xs = new int[W];
		int[] ys = new int[H];

		for (int i = 0; i < N; i++) {
			words = br.readLine().split(" ");
			int x, y, w;
			x = parseInt(words[0]);
			y = parseInt(words[1]);
			w = parseInt(words[2]);

			//
			if (0 <= x - w) {
				xs[x - w]++;
			} else {
				xs[0]++;
			}
			if (x + w < W) {
				xs[x + w]--;
			}
			//
			if (0 <= y - w) {
				ys[y - w]++;
			} else {
				ys[0]++;
			}
			if (y + w < H) {
				ys[y + w]--;
			}
		}

		boolean fillW = true, fillH = true;
		//
		for (int i = 1; i < xs.length; i++) {
			xs[i] += xs[i - 1];
			if (xs[i] == 0) {
				fillW = false;
				break;
			}
		}
		//
		for (int i = 1; i < ys.length; i++) {
			ys[i] += ys[i - 1];
			if (ys[i] == 0) {
				fillH = false;
				break;
			}
		}
		if (fillW | fillH) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	} //end main
}