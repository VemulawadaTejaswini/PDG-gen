import java.util.*;
public class Main {
	static int MAX = 100;
	static int top;
	static int[] entry;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		top = -1;
		entry = new int[MAX];
		String input;
		int a, b;
		while (cin.hasNext()) {
			input = cin.next();
			if (input.charAt(0) == '+') {
				a = pop();
				b = pop();
				push(a + b);
			} else if (input.charAt(0) == '-') {
				b = pop();
				a = pop();
				push(a - b);
			} else if (input.charAt(0) == '*') {
				a = pop();
				b = pop();
				push(a * b);
			} else {
				push(Integer.parseInt(input));
			}
		}
		System.out.println(pop());
	}
	static void push(int x) {
		top++;
		entry[top] = x;
	}
	static int pop() {
		top--;
		return entry[top + 1];
	}
}
