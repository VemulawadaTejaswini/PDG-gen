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
			if (line.charAt(0) == '.') break;

			Deque<Character> stack = new ArrayDeque<Character>();
			stack.push(' ');

			boolean ans = true;
			outer:
			for (char c : line.toCharArray()) {
				if (c == '(' || c == '[') {
					stack.push(c);
				} else if (c == ')') {
					if (stack.peekFirst() == '(') {
						stack.pop();
					} else {
						ans = false;
						break outer;
					}
				} else if (c == ']') {
					if (stack.peekFirst() == '[') {
						stack.pop();
					} else {
						ans = false;
						break outer;
					}
				}
			}
			System.out.println(ans ? "yes" : "no");
		} //end while
	} //end main
}