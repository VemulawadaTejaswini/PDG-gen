import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> queue = new LinkedList<>();
		Deque<String> names = new LinkedList<>();
		int time = 0;
		int n = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < n; i++) {
			names.add(sc.next());
			queue.add(sc.nextInt());
		}
		while (queue.size() > 0) {
			queue.addLast(queue.poll() - q);
			names.addLast(names.poll());
			time += q;
			if (queue.peekLast() <= 0) {
				time += queue.pollLast();
				System.out.println(names.pollLast() + " " + time);
			}
		}
	}
}

