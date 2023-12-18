import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			String[][] conv = new String[n][2];
			for (int i = 0; i < conv.length; i++) {
				conv[i][0] = sc.next();
				conv[i][1] = sc.next();
			}

			String before = sc.next();
			String after = sc.next();

			Deque<String> deque = new ArrayDeque<String>();
			deque.addLast(before);
			int depth = 0;
			boolean convertable = false;
			bfs: while (!deque.isEmpty()) {
				depth++;
				int size = deque.size();
				for (int q = 0; q < size; q++) {
					String poll = deque.pollFirst();
					for (int i = 0; i < conv.length; i++) {
						String test = poll.replaceAll(conv[i][0], conv[i][1]);
						if (test.equals(poll)) {
							continue;
						} else if (test.equals(after)) {
							convertable = true;
							break bfs;
						} else if (test.length() <= after.length()) {
							deque.addLast(test);
						}
					}
				}
			}
			if (convertable) {
				System.out.println(depth);
			} else {
				System.out.println(-1);
			}
		}
	}
}