import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Parentheses
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Deque<Character> stackP = new ArrayDeque<>();
		Deque<Integer> stackX = new ArrayDeque<>();
		stackP.push('\0');
		stackX.push(-1);

		int n = parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			line = br.readLine();

			char p = line.charAt(0);
			int x = parseInt(line.substring(line.indexOf(' ') + 1));

			if (stackP.peek() == p) {
				x += stackX.pop();
				stackX.push(x);
			} else if (stackP.peek() == '(' && p == ')') {
				if (stackX.peek() == x) {
					stackX.pop();
					stackP.pop();
				} else if (stackX.peek() > x) {
					int y = stackX.pop() - x;
					stackX.push(y);
				} else {
					stackP.pop();
					x -= stackX.pop();
					stackP.push(p);
					stackX.push(x);
				}
			} else {
				stackP.push(p);
				stackX.push(x);
			}
		}

		System.out.println(stackX.peek() == -1 ? "YES" : "NO");

	}
}