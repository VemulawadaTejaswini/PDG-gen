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

		Deque<Character> stack = new ArrayDeque<>();
		stack.push('\0');

		int n = parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			line = br.readLine();

			char p = line.charAt(0);
			int x = parseInt(line.substring(line.indexOf(' ') + 1));

			for (int j = 0; j < x; j++) {
				if (p == ')' && stack.peek() == '(') {
					stack.pop();
				} else {
					stack.push(p);
				}
			}
		}

		System.out.println(stack.size() == 1 ? "YES" : "NO");

	}
}