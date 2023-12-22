import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

import static java.lang.Integer.decode;
import static java.lang.Integer.parseInt;

/**
 * Elementary data structures - Stack
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> stack = new ArrayDeque<Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			int a, b;
			switch (str.charAt(0)) {
				case '+':
					b = stack.pop();
					a = stack.pop();
					stack.push(a + b);
					break;
				case '-':
					b = stack.pop();
					a = stack.pop();
					stack.push(a - b);
					break;
				case '*':
					b = stack.pop();
					a = stack.pop();
					stack.push(a * b);
					break;
				default:
					stack.push(parseInt(str));
					break;
			}
		}
		System.out.println(stack.pop());
	} //end main
}