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
			Deque<Character> stack = new ArrayDeque<Character>();
			stack.push(' ');

			boolean ans = true;
			outer:
			for (char c : line.toCharArray()) {
				switch (c) {
					case '(':
					case '[':
						stack.push(c);
						break;
					case ')':
						if (stack.peekFirst() == '(') {
							stack.pop();
						} else {
							ans = false;
							break outer;
						}
						break;
					case ']':
						if (stack.peekFirst() == '[') {
							stack.pop();
						} else {
							ans = false;
							break outer;
						}
						break;
				}
			}
			System.out.println(ans ? "yes" : "no");
		} //end while
	} //end main
}