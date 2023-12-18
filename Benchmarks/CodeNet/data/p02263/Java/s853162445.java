
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lineArr = line.split(" ");

		Deque<String> stack = new ArrayDeque<String>();
		for (String s : lineArr) {
			if ("+".equals(s)) {
				int a = Integer.parseInt(stack.pop());
				int b = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(a + b));
			} else if ("-".equals(s)) {
				int a = Integer.parseInt(stack.pop());
				int b = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(b - a));
			} else if ("*".equals(s)) {
				int a = Integer.parseInt(stack.pop());
				int b = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(a * b));
			} else {
				stack.push(s);
			}
		}
		System.out.println(stack.pop());
	}
}