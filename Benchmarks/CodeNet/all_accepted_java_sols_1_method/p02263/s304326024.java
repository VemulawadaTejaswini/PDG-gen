
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();

		while (in.hasNext()) {
			String cur = in.next();
			
			if (cur.equals("*") || cur.equals("+") || cur.contentEquals("-")) {
				int x = stack.pop();
				int y = stack.pop();
				int z;

				if (cur.equals("*")) {
					z = y * x;
				} else if (cur.contentEquals("+")) {
					z = y + x;
				} else {
					z = y - x;
				}

				stack.push(z);
			} else {
				stack.push(Integer.parseInt(cur));
			}
		}
		
		System.out.println(stack.peek());
	}
}
