// Space-Time Sugoroku Road
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] road = new int[N];
		for (int i = 0; i < N; i++)
			road[i] = sc.nextInt();
		int[] to = new int[N];
		for (int i = 0; i < N; i++) {
			if (to[i] != -1) {
				if (road[i] == 0) {
					to[i] = i;
					continue;
				}
				Set<Integer> set = new HashSet<Integer>();
				int t = i;
				while (set.add(t) && road[t] != 0)
					t += road[t];
				if (road[t] != 0)
					for (Integer j : set)
						to[j] = -1;
				else
					for (Integer j : set)
						to[j] = t;
			}
		}
		int[] turn = new int[N];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		while (!queue.isEmpty() && turn[N - 1] == 0) {
			int pos = queue.poll();
			for (int i = 1; i <= 6; i++) {
				int t = pos + i;
				if (t < N && to[t] >= t && turn[to[t]] == 0) {
					turn[to[t]] = turn[pos] + 1;
					queue.add(to[t]);
				}
			}
		}
		// for (int i = 0; i < N; i++)
		// System.out.println(to[i]);
		// System.out.println();
		// for (int i = 0; i < N; i++)
		// System.out.println(turn[i]);
		// System.out.println();
		System.out.println(turn[N - 1]);
		sc.close();
	}
}