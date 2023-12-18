
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		List<Integer>[] es = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			es[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			es[a].add(b);
			es[b].add(a);
		}

		long[] dp = new long[n];
		for (int i = 0; i < q; i++) {
			int v = sc.nextInt() - 1;
			int x = sc.nextInt();
			dp[v] += x;
		}

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{0, -1});
		while (!queue.isEmpty()) {
			int[] x = queue.poll();
			if (x[1] >= 0) dp[x[0]] += dp[x[1]];

			for (Integer e : es[x[0]]) {
				if (e != x[1]) {
					queue.offer(new int[]{e, x[0]});
				}
			}
		}

		for (int i = 0; i < dp.length; i++) {
			System.out.print(dp[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
