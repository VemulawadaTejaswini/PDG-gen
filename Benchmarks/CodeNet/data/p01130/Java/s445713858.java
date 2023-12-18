
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	@SuppressWarnings({ "unused", "unchecked" })
	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			int m = scanner.nextInt();
			int s = scanner.nextInt();
			int g1 = scanner.nextInt();
			int g2 = scanner.nextInt();
			if ((n | m | s | g1 | g2) == 0)
				break;
			s--;
			g1--;
			g2--;
			int[][] g = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					g[i][j] = i == j ? 0 : INF;

			List<Pair>[] slist = new List[n];
			List<Pair>[] glist = new List[n];
			for (int i = 0; i < n; i++) {
				slist[i] = new ArrayList<Main.Pair>();
				glist[i] = new ArrayList<Main.Pair>();
			}

			while (m-- > 0) {
				int b1 = scanner.nextInt() - 1;
				int b2 = scanner.nextInt() - 1;
				int c = scanner.nextInt();
				slist[b1].add(new Pair(b2, c));
				glist[b2].add(new Pair(b1, c));
			}
			int[] acost = slove(s, slist);
			int[] bcost = slove(g1, glist);
			int[] ccost = slove(g2, glist);

			int ans = INF;
			for (int i = 0; i < n; i++)
				ans = Math.min(ans, acost[i] + bcost[i] + ccost[i]);
			System.out.println(ans);
		}
	}

	private int[] slove(int s, List<Pair>[] lists) {
		PriorityQueue<Pair> pq = new PriorityQueue<Main.Pair>();
		pq.offer(new Pair(s, 0));
		int[] dp = new int[n];
		Arrays.fill(dp, INF);
		dp[s] = 0;
		while (!pq.isEmpty()) {
			Pair p = pq.poll();
			if (dp[p.d] < p.cost)
				continue;
			for (Pair pair : lists[p.d]) {
				int ncost = p.cost+pair.cost;
				if(dp[pair.d]<=ncost)
					continue;
				dp[pair.d] = ncost;
				pq.offer(new Pair(pair.d, ncost));
			}
		}
		return dp;
	}

	int INF = 1 << 29;
	int n;

	class Pair implements Comparable<Pair> {
		int d, cost;

		public Pair(int d, int cost) {
			super();
			this.d = d;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Pair [d=" + d + ", cost=" + cost + "]";
		}

		@Override
		public int compareTo(Pair o) {
			return cost - o.cost;
		}

	}
}