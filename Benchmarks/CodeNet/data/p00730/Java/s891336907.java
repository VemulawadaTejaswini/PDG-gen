import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Cut the Cake
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(" ");

			int n, w, d;
			n = parseInt(words[0]);
			w = parseInt(words[1]);
			d = parseInt(words[2]);
			if ((n | w | d) == 0) break;

			Map<Integer, Piece> pieces = new HashMap<>();
			pieces.put(1, main.new Piece(w, d));

			//cut
			for (int i = 0; i < n; i++) {

				words = br.readLine().split(" ");

				int p, s;
				p = parseInt(words[0]);
				s = parseInt(words[1]);

				int later = pieces.size() + 1;
				Piece former = pieces.get(p);
				pieces.put(later, former.cut(s));
			}

			//
			int[] areas = new int[pieces.size()];
			for (int i = 0; i < areas.length; i++) {
				areas[i] = pieces.get(i + 1).area;
			}
			Arrays.sort(areas);
			StringBuilder sb = new StringBuilder();
			sb.append(areas[0]);
			for (int i = 1; i < areas.length; i++) {
				sb.append(' ').append(areas[i]);
			}
			System.out.println(sb.toString());

		} //end while
	} //end main

	class Piece {
		int w, d;
		int area;

		Piece(int w, int d) {
			this.w = w;
			this.d = d;
			area = w * d;
		}

		Piece cut(int s) {
			int _w = 0, _d = 0;
			int _s = s % (w + d);
			if (_s < w) {
				//cut on w edge.
				_w = w - _s < _s ? _s : w - _s;
				_d = d;
				w = w - _w;
			} else {
				//cut on d edge.
				_w = w;
				_s = _s - w;
				_d = d - _s < _s ? _s : d - _s;
				d = d - _d;
			}
			//re-calc
			area = w * d;
			return new Piece(_w, _d);
		}
	}
}