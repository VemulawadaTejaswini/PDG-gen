import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Smart Calculator
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		//skip first line
		br.readLine();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			Deque<String> queue = new ArrayDeque<>();
			Deque<Character> stack = new ArrayDeque<>();

			char _c = 0;
			for (char c : line.toCharArray()) {
				switch (c) {
					case '+':
					case '-':
						if (!stack.isEmpty()) {
							while (stack.peek() == '*' || stack.peek() == '/') {
								queue.offer(String.valueOf(stack.pop()));
							}
						}
						stack.push(c);
						break;
					case '*':
					case '/':
					case '(':
						stack.push(c);
						break;
					case ')':
						while (stack.peek() != '(') {
							queue.offer(String.valueOf(stack.pop()));
						}
						stack.pop();
						break;
					case '=':
						while (!stack.isEmpty()) {
							queue.offer(String.valueOf(stack.pop()));
						}
						break;
					default:
						if ('0' <= _c && _c <= '9') {
							String s = queue.pollLast();
							queue.offer(s + c);
						} else {
							queue.offer(String.valueOf(c));
						}
				}
				_c = c;
			}

			//solve
			Deque<Integer> ans = new ArrayDeque<>();
			for (String s : queue) {
				if ("+-*/".indexOf(s) != -1) {
					int a, b;
					b = ans.pop();
					a = ans.pop();
					switch (s) {
						case "+":
							ans.push(a + b);
							break;
						case "-":
							ans.push(a - b);
							break;
						case "*":
							ans.push(a * b);
							break;
						case "/":
							ans.push(a / b);
							break;
					}
				} else {
					ans.push(parseInt(s));
				}
			}
			System.out.println(ans.peek());

		}//end while
	}//end main
}