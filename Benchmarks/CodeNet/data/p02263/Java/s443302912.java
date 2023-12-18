import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			if (in.hasNextInt()) {
				stk.push(in.nextInt());
			} else {
				int y = (int) stk.pop();
				int x = (int) stk.pop();
				int result = 0;
				String operator = in.next();
				if (operator.equals("+")) {
					result = x + y;
				} else if (operator.equals("-")) {
					result = x - y;
				} else if (operator.equals("*")) {
					result = x * y;
				} else if (operator.equals("/")) {
					result = x / y;
				}
				
				stk.push(result);
				
			}
		}
		
		System.out.println(stk.pop());
		
	}

}
