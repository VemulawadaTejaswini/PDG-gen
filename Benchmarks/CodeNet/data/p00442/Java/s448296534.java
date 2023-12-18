
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer>[] lists = new ArrayList[n];
		int[] deg = new int[n];
		for (int i = 0; i < n; i++)
			lists[i] = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int w = scanner.nextInt() - 1;
			int l = scanner.nextInt() - 1;
			lists[w].add(l);
			deg[l]++;
		}
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (int i = 0;i<n;i++)
			if (deg[i] == 0)
				deque.push(i);
		boolean flag = false;
		while (!deque.isEmpty()) {
			if (deque.size() > 1)
				flag = true;
			int a = deque.poll();
			System.out.println(a + 1);
			for (int x : lists[a]) {
				deg[x]--;
				if (deg[x] == 0)
					deque.push(x);
			}
		}
		System.out.println(flag ? 1 : 0);

	}
}