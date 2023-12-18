import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			String str = s.nextLine();
			if (str.equals("."))
				break;

			char[] c = new char[100];
			for (int i = 0; i < str.length(); i++) {
				c[i] = str.charAt(i);
				// System.out.println(c[i]);
			}

			// for (int i = 0; i<str.length(); i++) {
			// System.out.println(c[i]);
			// }

			Stack<Character> stack = new Stack<Character>();
			String ans = "yes";

			for (int count = 0; count < str.length(); count++) {
				if (c[count] == '[') {
					stack.push(']');
				} else if (c[count] == '(') {
					stack.push(')');
				} else if (c[count] == ']') {
					if (stack.empty())
						ans = "no";
					else if (stack.pop() != ']')
						ans = "no";
				} else if (c[count] == ')') {
					if (stack.empty())
						ans = "no";
					else if (stack.pop() != ')')
						ans = "no";
				}
			}

			// for (int j = 0; j < str.length() - 1; j++)
			// System.out.println(stack.pop());

			// if (stack.empty())
			// System.out.println("yes");
			// else
			// System.out.println("no");

			if (!stack.empty())
				ans = "no";
			System.out.println(ans);
		}

		s.close();
	}
}