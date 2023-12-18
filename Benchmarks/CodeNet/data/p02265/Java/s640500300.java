import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Deque<Integer> deque = new ArrayDeque<Integer>(2000000);
		StringBuilder builder = new StringBuilder();

		for(int i = 0; i < n; i++) {
			String s = sc.next();

			switch(s) {
			case "insert":
				deque.push(sc.nextInt());
				break;
			case "delete":
				deque.remove(sc.nextInt());
				break;
			case "deleteFirst":
				deque.removeFirst();
			case "deleteLast":
				deque.removeLast();
			}
		}

		builder.append(deque.poll());
		for(int num : deque)
			builder.append(" ").append(num);
		System.out.println(builder);
	}

}
