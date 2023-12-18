import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		Stack<Integer> stack = new Stack<Integer>();
		
		for (; sc.hasNext(); ) {
			if (sc.hasNextInt()) {
				stack.push(sc.nextInt());
			} else {
				char op = sc.next().charAt(0);
				int b = stack.pop();
				int a = stack.pop();
				int result;
				switch (op) {
				case '+':
					result = a + b;
					break;
				case '-':
					result = a - b;
					break;
				case '*':
					result = a * b;
					break;
				default:
					result = -1;
				}
				stack.push(result);
			}
		}
		
    	System.out.println(stack.pop());
    	
        sc.close();
	}
}