
import java.util.Stack;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Stack<String> expr = new Stack<>();
		while (in.hasNext()) {
			String next = in.next();
			if (next.equals("+")) {
				int a = Integer.parseInt(expr.pop());
				int b = Integer.parseInt(expr.pop());
				int result = a + b;
				expr.push((result + ""));
			} else if(next.equals("-")) {
				int a = Integer.parseInt(expr.pop());
				int b = Integer.parseInt(expr.pop());
				int result = b - a;
				expr.push((result + ""));
			} else if (next.equals("*")) {
				int a = Integer.parseInt(expr.pop());
				int b = Integer.parseInt(expr.pop());
				int result = a * b;
				expr.push((result + ""));
			} else {
				expr.push(next);
			}
			
		}
		System.out.println(expr.peek());
	}
}

