import java.util.*;

public class Main {
	public static void main(String[] args) {
		Stack<Long> stack = new Stack<Long>();
		Scanner scanner0 = new Scanner(System.in);
		Scanner scanner = new Scanner(scanner0.nextLine());
		scanner0.close();
		
		while (scanner.hasNext()) {
			if (scanner.hasNextLong()) {
				stack.push(scanner.nextLong());
			} else {
				long operand2 = stack.pop();
				long operand1 = stack.pop();
				String operator = scanner.next();
				
				if (operator.equals("+")) {
					stack.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					stack.push(operand1 - operand2);
				} else {
					stack.push(operand1 * operand2);
				}
			}
		}
				
		scanner.close();
		
		System.out.println(stack.pop());
	}
} 

