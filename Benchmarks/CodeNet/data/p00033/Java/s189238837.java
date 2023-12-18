import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] ball = new int[10];
			while (sc.hasNextInt()) {
				int dataset = sc.nextInt();
				for (int i = 0; i < dataset; i++) {
					for (int j = 0; j < 10; j++) {
						ball[j] = sc.nextInt();
					}
					if (isReapAll(ball)) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		} finally {
			sc.close();
		}
	}

	public static boolean isReapAll(int[] numbers) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		for (int number : numbers) {
			if (stack1.isEmpty() || stack1.peek() < number) {
				stack1.push(number);
			} else if (stack2.isEmpty() || stack2.peek() < number) {
				stack2.push(number);
			} else {
				return false;
			}
		}
		return true;
	}
}