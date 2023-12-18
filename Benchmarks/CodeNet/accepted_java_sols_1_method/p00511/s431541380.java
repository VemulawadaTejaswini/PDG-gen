import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Simple Calculator
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Deque<Character> ops = new ArrayDeque<>();
		Deque<Integer> nums = new ArrayDeque<>();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("=")) {
				System.out.println(nums.pop());
				break;
			}

			switch (line.charAt(0)) {
				case '+':
				case '-':
				case '*':
				case '/':
					ops.offer(line.charAt(0));
					break;
				default:
					if (ops.size() > 0) {
						char op = ops.pop();
						int num1 = nums.pop();
						int num2 = parseInt(line);
						switch (op) {
							case '+':
								num1 += num2;
								break;
							case '-':
								num1 -= num2;
								break;
							case '*':
								num1 *= num2;
								break;
							case '/':
								num1 /= num2;
								break;
						}
						nums.offer(num1);
					} else {
						nums.offer(parseInt(line));
					}
			}
		}
	} //end main
}