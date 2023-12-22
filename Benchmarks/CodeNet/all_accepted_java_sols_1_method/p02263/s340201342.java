import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		int a = 0, b = 0;
		String[] c;
		Scanner sc = new Scanner(System.in);
		c = sc.nextLine().split(" ");

		for (int i = 0; i < c.length; i++) {
			if (c[i].equals("+")) {
				int o2 = stack.pop();
				int o1 = stack.pop();
				stack.push(o1 + o2);
			} else if (c[i].equals("-")) {
				int o2 = stack.pop();
				int o1 = stack.pop();
				stack.push(o1 - o2);
			} else if (c[i].equals("*")) {
				int o2 = stack.pop();
				int o1 = stack.pop();
				stack.push(o1 * o2);
			} else {
				stack.push(Integer.parseInt(c[i]));
			}
		}
		System.out.println(stack.pop());

	}

}

