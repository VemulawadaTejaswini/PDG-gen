
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			me = scanner.nextInt();
			if (me == 0)
				break;
			n = scanner.nextInt();
			a = new int[n + 2];
			for (int i = 1; i <= n; i++)
				a[i] = scanner.nextInt();
			n += 2;
			boolean[] vis = new boolean[n];
			bfs(0, vis);
			if (!vis[n - 1]) {
				System.out.println("NG");
				continue;
			}
			boolean ok = true;
			for (int s = 1; s < n - 1; s++) {
				if (vis[s]) {
					boolean[] vis2 = new boolean[n];
					vis2[s] = true;
					bfs(s, vis2);
					if (!vis2[n - 1]) {
						ok = false;
						break;
					}
				}
			}
			System.out.println(ok ? "OK" : "NG");
		}
	}

	private void bfs(int s, boolean[] vis) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.push(s);
		while (!deque.isEmpty()) {
			int x = deque.poll();
			for (int d = 1; d <= me; d++) {
				int xx = Math.min(x + d, n - 1);
				xx = Math.max(Math.min(xx + a[xx], n - 1), 0);
				if (!vis[xx]) {
					vis[xx] = true;
					deque.push(xx);
				}
			}
		}
	}

	int n, me;
	int[] a;
}