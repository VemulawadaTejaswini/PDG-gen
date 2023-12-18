import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();

		String[] items = line.split(" ");
		Stack stack = new Stack();

		int op1;
		int op2;
		for (String item : items) {
			switch (item) {
			case "+":
				op2 = stack.pop();
				op1 = stack.pop();
				stack.push(op1 + op2);
				break;
			case "-":
				op2 = stack.pop();
				op1 = stack.pop();
				stack.push(op1 - op2);
				break;
			case "*":
				op2 = stack.pop();
				op1 = stack.pop();
				stack.push(op1 * op2);
				break;
			default:
				stack.push(Integer.parseInt(item));
			}
		}
		System.out.println(stack.pop());
	}
}

class Stack {
	private LinkedList<Integer> stack;
	public Stack() {
		stack = new LinkedList<Integer>();
	}
	public void push(int item) {
		stack.addLast(item);
	}
	public int pop() {
		int ret = stack.getLast();
		stack.removeLast();
		return ret;
	}
}