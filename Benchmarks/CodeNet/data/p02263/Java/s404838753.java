import java.util.Scanner;

class Main {
	public static int[] stack = new int[100];
	public static int top = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		while (sc.hasNext()) {
			String S = sc.next();
			if (S.charAt(0) == '+') {
				a = pop();
				b = pop();
				push(a + b);
			} else if (S.charAt(0) == '*') {
				a = pop();
				b = pop();
				push(a * b);
			} else if (S.charAt(0) == '-') {
				a = pop();
				b = pop();
				push(a - b);
			} else {
				push(Integer.parseInt(S));
			}
		}
		System.out.println(pop());
	}

	public static void push(int x) {
		stack[++top] = x;
		
	}

	public static int pop() {
		top--;
		return stack[top + 1];
	}
}
