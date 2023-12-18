import java.util.Scanner;
import java.util.Stack;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		new Main().run();

	}

	void run() {
		sc.useDelimiter("\n|\r\n");
		while (true) {
			String s = sc.next();
			if (s.equals("."))
				break;
			Stack<Character> stack = new Stack<Character>();
			boolean yes = true;
			for (int i = 0; i < s.length(); i++) {
				if (!yes)
					break;
				char c;
				switch (c = s.charAt(i)) {
				case '[':
					stack.push(c);
					break;
				case ']':
					if (stack.isEmpty()) {
						yes = false;
					} else {
						c = stack.pop();
						if (c != '[') {
							yes = false;
						}
					}
					break;
				case '(':
					stack.push(c);
					break;
				case ')':
					if (stack.isEmpty()) {
						yes = false;
					} else {
						c = stack.pop();
						if (c != '(') {
							yes = false;
						}
					}
					break;
				}
			}
			System.out.println(yes ? "yes" : "no");
		}
	}
}