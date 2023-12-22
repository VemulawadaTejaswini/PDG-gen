/**
 * The Balance of the World
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if (line.equals(".")) break;

			Deque<Character> stack = new ArrayDeque<Character>();
			stack.push(' ');
			for (char c : line.toCharArray()) {
				if ("([".indexOf(c) != -1) {
					stack.push(c);
				} else if (c == ')') {
					if (stack.peekFirst() == '(') {
						stack.pop();
					} else {
						stack.push(c);
					}
				} else if (c == ']') {
					if (stack.peekFirst() == '[') {
						stack.pop();
					} else {
						stack.push(c);
					}
				}
			}
			System.out.println(stack.size() == 1 ? "yes" : "no");
		} //end while
	} //end main
}