import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Problem A: And Then There Was One
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(" ");

			int n, k, m;
			n = parseInt(words[0]);
			k = parseInt(words[1]);
			m = parseInt(words[2]);
			if ((n | k | m) == 0) break;

			List<Integer> stones = new LinkedList<>();
			for (int i = 1; i <= n; i++) {
				stones.add(i);
			}

			//
			stones.remove(m - 1);

			int slot = m - 1;
			int count = stones.size();

			while (count != 1) {
				if (slot + k - 1 <= count - 1) {
					slot = slot + k - 1;
				} else {
					slot = (slot + k - 1) % count;
				}
				stones.remove(slot);
				count--;
			}

			System.out.println(stones.get(0));

		} //end while
	} //end main
}