
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
			max = scanner.nextInt();
			if (max == 0)
				break;
			n = scanner.nextInt();
			map = new int[n + 2];
			for (int i = 1; i <= n; i++)
				map[i] = scanner.nextInt();
			n += 2;
			boolean[] vis = new boolean[n];
			vis[0] = true;
			dfs(0, vis);
			if (!vis[n - 1]) {
				System.out.println("NG");
				continue;
			}
			boolean flag = true;
			for (int s = 1; s < n - 1; s++) {
				if (!vis[s])
					continue;
				boolean[] vis2 = new boolean[n];
				vis2[s] = true;
				dfs(s, vis2);
				if (!vis2[n - 1]) {
					flag = false;
					break;
				}
			}
			System.out.println(flag ? "OK" : "NG");

		}
	}

	private void dfs(int s, boolean[] vis) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.push(s);
		while (!deque.isEmpty()) {
			int x = deque.poll();
			for (int i = 1; i <= max; i++) {
				int nx = Math.min(x + i, n - 1);
				nx = Math.max(Math.min(nx + map[nx], n - 1), 0);
				if (!vis[nx]) {
					vis[nx] = true;
					deque.push(nx);
				}
			}
		}
	}

	int max, n;
	int[] map;
}