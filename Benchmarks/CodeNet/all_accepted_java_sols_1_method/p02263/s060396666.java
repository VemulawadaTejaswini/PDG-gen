import java.util.*;

public class Main {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner k = new Scanner(System.in);
		
		String[] equation = k.nextLine().split(" ");
		
		for(int x = 0; x < equation.length; x++) {
			if (equation[x].equals("+") ||equation[x].equals("-") ||equation[x].equals("*")) {
				int f = stack.pop();
				int g = stack.pop();
				if (equation[x].equals("+")) {
					stack.push(f+g);
				}
				else if (equation[x].equals("-")) {
					stack.push(g-f);
				}
				else if (equation[x].equals("*")) {
					stack.push(f*g);
				}
			}
			else {
				int y = Integer.parseInt(equation[x]);
				stack.push(y);
			}
		}
		
		System.out.println(stack.pop());
		
		
	}
}

