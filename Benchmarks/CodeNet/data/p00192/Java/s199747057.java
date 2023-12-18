
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n | m) == 0)
				break;

			int[] t = new int[m + 1];
			for (int i = 1; i <= m; i++) {
				t[i] = scanner.nextInt();
			}
			int[][] p = new int[n][2];
			Deque<Integer> deque = new ArrayDeque<Integer>();
			List<Integer> list = new ArrayList<Integer>();
			int r = 10;
			while (list.size() < m) {
				if (r / 10 <= m && r % 10 == 0) {
					deque.offer(r / 10);
				}
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < 2; j++) {
						if (p[i][j] > 0) {
							t[p[i][j]]--;
						}
					}
				}
				for (int i = 0; i < n; i++) {
					if (p[i][0] > 0 && t[p[i][0]] <= 0) {
						list.add(p[i][0]);
						p[i][0] = p[i][1];
						p[i][1] = 0;
						if (p[i][0] > 0 && t[p[i][0]] <= 0) {
							list.add(p[i][0]);
							p[i][0] = 0;
						}
					}
				}
				loop: while (!deque.isEmpty()) {
					int umin = Integer.MAX_VALUE;
					int dmin = Integer.MAX_VALUE;
					int u = -1;
					int d = -1;
					for (int i = 0; i < n; i++) {
						if (p[i][0] == 0) {
							p[i][0] = deque.poll();
							break loop;
						} else if (p[i][1] == 0) {
							int a = t[p[i][0]] - t[deque.peek()];
							if (a >= 0) {
								if (umin > a) {
									umin = a;
									u = i;
								}
							} else {
								a *= -1;
								if (dmin > a) {
									dmin = a;
									d = i;
								}
							}
						}
					}
					if (u != -1) {
						p[u][1] = p[u][0];
						p[u][0] = deque.poll();
					} else if (d != -1) {
						p[d][1] = p[d][0];
						p[d][0] = deque.poll();
					} else {
						break;
					}
				}
				r++;
			}
			for (int i = 0; i < m; i++) {
				System.out.print(list.get(i));
				System.out.print(i == m - 1 ? '\n' : ' ');
			}

		}
	}
}