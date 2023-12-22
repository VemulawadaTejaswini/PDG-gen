import java.util.Stack;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		
		String input = in.nextLine();
		String[] tokens = input.split(" ");
		
		for (String n : tokens) {
			int o1, o2;
			
			String[] operations = {"+", "-", "*", "/"};
			boolean op = false;
			
			for (String operation : operations) {
				if (n.equals(operation)) {
					op = true;
				}
			}
			
			if (op) {
				o1 = Integer.parseInt(stack.pop());
				o2 = Integer.parseInt(stack.pop());
				
				switch (n) {
					case "+":
						stack.push("" + (o2 + o1));
						break;
					case "-":
						stack.push("" + (o2 - o1));
						break;
					case "*":
						stack.push("" + (o2 * o1));
						break;
					case "/":
						stack.push("" + (o2 / o1));
						break;
					case "%":
						stack.push("" + (o2 % o1));
						break;
				}
			} else {
				stack.push(n);
			}
		}
		
		System.out.println(stack.pop());
	}
}
