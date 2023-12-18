import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			String line = s.nextLine();
			if (line.equals("."))
				break;
			System.out.println(CheckParenthesis(line) ? "yes" : "no");
		}
		s.close();
	}

	private static boolean CheckParenthesis(String line) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			switch (ch) {
			case '[':
				stack.push(']');
				break;
			case '(':
				stack.push(')');
				break;
			case ']':
			case ')':
				if (stack.empty() || stack.pop() != ch)
					return false;
			}
		}
		return stack.empty();
	}
}