
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			Deque<Pair> deque = new ArrayDeque<Pair>();
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				if (i % 2 == 1) {
					if (deque.peek().clr == a)
						deque.peek().num++;
					else {
						int num = deque.poll().num;
						if (deque.isEmpty())
							deque.push(new Pair(a, num + 1));
						else
							deque.peek().num += num + 1;
					}
				} else {
					if (deque.isEmpty() || deque.peek().clr != a)
						deque.push(new Pair(a, 1));
					else
						deque.peek().num++;
				}

			}
			int wcnt = 0;
			while (!deque.isEmpty()) {
				if (deque.peek().clr == 0)
					wcnt += deque.peek().num;
				deque.poll();
			}
			System.out.println(wcnt);
		}
	}

	class Pair {
		int clr, num;

		public Pair(int clr, int num) {
			super();
			this.clr = clr;
			this.num = num;
		}

		@Override
		public String toString() {
			return "Pair [clr=" + clr + ", num=" + num + "]";
		}

	}
}