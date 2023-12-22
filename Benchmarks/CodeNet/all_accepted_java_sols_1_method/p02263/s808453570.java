import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] S = sc.nextLine().split(" ");
		Deque<Integer> stack = new ArrayDeque<Integer>();

		int a;
		int b;

		for (String s : S) {
			if ("+".equals(s)) {
				a = stack.pollLast();
				b = stack.pollLast();
				stack.offer(b + a);
			} else if ("-".equals(s)) {
				a = stack.pollLast();
				b = stack.pollLast();
				stack.offer(b - a);
			} else if ("*".equals(s)) {
				a = stack.pollLast();
				b = stack.pollLast();
				stack.offer(b * a);
			} else {
				stack.offer(Integer.parseInt(s));
			}
		}

		System.out.println(stack.pollLast());

		sc.close();
	}
}

