import java.util.Scanner;

public class Main {
	static int top = 1;
	static int[] stack = new int[200];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int tmpNum = sc.nextInt();
				pop(tmpNum);

			} else {
				String opr = sc.next();
				int a = push();
				int b = push();

				switch (opr) {
				case "+":
					pop(b + a);
					break;
				case "-":
					pop(b - a);
					break;
				case "*":
					pop(b * a);
					break;

				}

			}
		}
		System.out.println(push());

	}

	static void pop(int x) {
		if (top == stack.length - 1) {
			System.err.println("スタックが満杯です");
			return;
		}
		stack[top] = x;
		top++;
	}

	static int push() {
		if (top == 0) {
			System.err.println("スタックが空っぽです");
			return -1;
		}
		top--;
		int ret = stack[top];
		return ret;
	}

}

