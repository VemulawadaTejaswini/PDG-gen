import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Problem A: Citation Format
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line);
			if (n == 0) break;

			words = br.readLine().split(" ");
			Deque<Integer> queue = new ArrayDeque<>();

			for (int i = 0; i < n; i++) {
				int next = parseInt(words[i]);
				if (i == 0) {
					queue.add(next);
				} else if (i == 1) {
					if (queue.peekLast() + 1 == next) {
						queue.add(-1);
						queue.add(next);
					} else {
						queue.add(0);
						queue.add(next);
					}
				} else {
					if (queue.peekLast() + 1 == next) {
						int prev = queue.removeLast();
						if (queue.peekLast() == -1) {
							queue.add(next);
						} else {
							queue.add(prev);
							queue.add(-1);
							queue.add(next);
						}
					} else {
						queue.add(0);
						queue.add(next);
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int i : queue) {
				if (i == 0) {
					sb.append(" ");
				} else if (i == -1) {
					sb.append("-");
				} else {
					sb.append(i);
				}
			}
			System.out.println(sb.toString());

		}//end while
	}//end main
}