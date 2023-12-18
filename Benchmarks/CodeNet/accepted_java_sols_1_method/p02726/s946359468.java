import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] answer = new int[n];

		Set<Integer> visited = new HashSet<>();
		Map<Integer, Set<Integer>> h = new HashMap<>();
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.clear();
			visited.clear();
			h.clear();

			q.offer(new int[]{i, 0});
			visited.add(i);
			while (!q.isEmpty()) {
				int[] p = q.poll();
				answer[p[1]]++;

				if (p[0] + 1 < n && !visited.contains(p[0] + 1)) {
					visited.add(p[0] + 1);
					q.add(new int[]{p[0] + 1, p[1] + 1, p[0]});
				}

				if (x - 1 == p[0] && !visited.contains(y - 1)) {
					visited.add(y - 1);
					q.add(new int[]{y - 1, p[1] + 1, p[0]});
				}

				if (y - 1 == p[0] && !visited.contains(x - 1)) {
					visited.add(x - 1);
					q.add(new int[]{x - 1, p[1] + 1, p[0]});
				}

				if (p[0] - 1 >= 0 && !visited.contains(p[0] - 1)) {
					visited.add(p[0] - 1);
					q.add(new int[]{p[0] - 1, p[1] + 1, p[0]});
				}
			}
		}


		StringBuilder sb = new StringBuilder();
		for (int k = 1; k <= n - 1; k++) {
			sb.append(Math.max(0, answer[k] / 2)).append("\n");
		}

		System.out.print(sb);
	}
}
