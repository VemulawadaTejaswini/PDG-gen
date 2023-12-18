import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] symbols = in.nextLine().split(" ");
		Stack<String> stack = new Stack<>();
		for (int i=0; i<symbols.length; i++) {
			if (symbols[i].equals("+")) {
				int value1 = Integer.parseInt(stack.pop());
				int value2 = Integer.parseInt(stack.pop());
				stack.push(Integer.toString(value1 + value2));
			} else if (symbols[i].equals("-")) {
				int value1 = Integer.parseInt(stack.pop());
				int value2 = Integer.parseInt(stack.pop());
				stack.push(Integer.toString(value2 - value1));
			} else if (symbols[i].equals("*")) {
				int value1 = Integer.parseInt(stack.pop());
				int value2 = Integer.parseInt(stack.pop());
				stack.push(Integer.toString(value1 * value2));
			} else {
				stack.push(symbols[i]);
			}
		}
		System.out.println(Integer.parseInt(stack.pop()));
		
	}

}

