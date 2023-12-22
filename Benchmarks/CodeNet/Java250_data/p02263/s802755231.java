
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String[] strs = reader.readLine().split(" ");
		Stack<Integer> stack = new Stack<Integer>();

		for (String s : strs) {
			if (Character.isDigit(s.charAt(0)))
				stack.push(Integer.parseInt(s));
			else {
				int pop1 = stack.pop();
				int pop2 = stack.pop();
				switch (s.charAt(0)) {
				case '+':
					stack.push(pop2 + pop1);
					break;
				case '-':
					stack.push(pop2 - pop1);
					break;
				default:
					stack.push(pop2 * pop1);
					break;
				}
			}
			/*System.out.println(stack.stream().map(String::valueOf)
					.collect(Collectors.joining(", ", "[", "]")));*/
		}
		System.out.println(stack.pop());
	}
}