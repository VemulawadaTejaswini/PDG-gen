
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String[] fiz = new String[10001];
		for (int i = 1; i <= 10000; i++) {
			if (i % 15 == 0)
				fiz[i] = "FizzBuzz";
			else if (i % 5 == 0)
				fiz[i] = "Buzz";
			else if (i % 3 == 0)
				fiz[i] = "Fizz";
			else
				fiz[i] = String.valueOf(i);
		}
		while (true) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			if ((m | n) == 0)
				break;
			Deque<Integer> deque = new ArrayDeque<Integer>();
			for (int i = 1; i <= m; i++) {
				deque.offer(i);
			}
			for (int i = 1; i <= n; i++) {
				String str = scanner.next();
				if (deque.size() == 1)
					continue;
				int a = deque.poll();
				if (str.equals(fiz[i])) {
					deque.offer(a);
				}
			}
			int size = deque.size();
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			pq.addAll(deque);
			for (int i = 0; i < size; i++) {
				System.out.print(pq.poll());
				System.out.print(i == size - 1 ? '\n' : ' ');
			}

		}
	}
}