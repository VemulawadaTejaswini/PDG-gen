import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * ABC Gene
 */
public class Main {

	static String TARGET = "ABC";
	static String[] REP = {"A", "B", "C"};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Deque<String> queue = new ArrayDeque<>();

		queue.offer(br.readLine());
		boolean ans = false;

		while (!queue.isEmpty()) {

			String s = queue.poll();

			if (s.equals(TARGET)) {
				ans = true;
				break;
			}

			for (String rep : REP) {
				String _s = s.replace(TARGET, rep);
				if (!_s.equals(s)) {
					queue.offer(_s);
				}
			}
		}

		System.out.println(ans ? "Yes" : "No");

	} //end main
}