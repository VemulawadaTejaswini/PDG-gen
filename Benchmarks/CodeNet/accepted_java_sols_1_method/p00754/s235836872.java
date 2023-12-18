import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
		while (!line.equals(".")) {
			Stack<Character> stack = new Stack<>();
			boolean yes = true;
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c == '(' || c == '[') {
					stack.push(Character.valueOf(c));
				} else if (c == ')' || c == ']') {
					if (stack.isEmpty()) {
						yes = false;
						break;
					}
					char c0 = stack.pop().charValue();
					if (c == ')' && c0 != '(') {
						yes = false;
						break;
					}
					if (c == ']' && c0 != '[') {
						yes = false;
						break;
					}
				} else if (c == '.') {
					break;
				}
			}
			if (yes) {
				if (!stack.isEmpty()) yes = false;
			}
			System.out.println(yes ? "yes": "no");
	        line = scanner.nextLine();
		}
	}
}

