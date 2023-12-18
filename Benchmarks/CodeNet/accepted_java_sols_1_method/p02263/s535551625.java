import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Long> stack = new Stack<>();
		while (s.hasNext()) {
			String in = s.next();
			try {
				stack.push(Long.parseLong(in));
			} catch (Exception e) {
				switch (in) {
					case "+":
						stack.push(stack.pop() + stack.pop());
						break;
					case "-":
						long x1 = stack.pop();
						long x2 = stack.pop();
						stack.push(x2 - x1);
						break;
					case "/":
						long x11 = stack.pop();
						long x22 = stack.pop();
						stack.push(x22 / x11);
						break;
					case "*":
						stack.push(stack.pop() * stack.pop());
						break;
				}
			}
		}
		System.out.println(stack.pop());
	}
}

