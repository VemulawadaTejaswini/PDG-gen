import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Dequeはインターフェースなので、実装クラスのArrayDequeで実装
		Deque<Integer> stack = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int curNum = 0;
			String curStr = "";
			if (sc.hasNextInt()) {
				curNum = sc.nextInt();
				stack.push(curNum);
			} else {
				curStr = sc.next();
				int a = stack.pop();
				int b = stack.pop();
				switch (curStr) {
				case "+":
					stack.push(b + a);
					break;
				case "-":
					stack.push(b - a);
					break;
				case "*":
					stack.push(b * a);
					break;
				}
			}

		}
		System.out.println(stack.pop());

	}

}
