import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Longest Steps
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int k = parseInt(line.substring(line.indexOf(' ') + 1));

			boolean[] cards = new boolean[n + 1];
			for (int i = 0; i < k; i++) {
				cards[parseInt(br.readLine())] = true;
			}

			int sum = 0;
			List<Integer> list = new ArrayList<Integer>();
			list.add(0);
			for (int i = 1; i < n + 1; i++) {
				if (cards[i]) {
					sum += 1;
				} else {
					if (sum > 0) {
						list.add(sum);
					}
					list.add(0);
					sum = 0;
				}
			}
			if (sum > 0) {
				list.add(sum);
			}
			list.add(0);

			int max = 0;
			for (int i = 1; i < list.size() - 1; i++) {
				if (cards[0] && list.get(i) == 0) {
					int steps = list.get(i - 1) + 1 + list.get(i + 1);
					if (steps > max) {
						max = steps;
					}
				} else {
					if (list.get(i) > max) {
						max = list.get(i);
					}
				}
			}
			System.out.println(max);
		}

	}
}