// Space-Time Sugoroku Road
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] road = new int[N];
		for (int i = 0; i < N; i++)
			road[i] = sc.nextInt();
		boolean[] infLoop = new boolean[N];
		Arrays.fill(infLoop, false);
		for (int i = 0; i < N; i++)
			if (!infLoop[i] && road[i] != 0) {
				Set<Integer> set = new HashSet<Integer>();
				int t = i;
				while (set.add(t) && road[t] != 0 && !infLoop[t])
					t += road[t];
				if (road[t] != 0)
					for (Integer j : set)
						infLoop[j] = true;
			}
		int[] turn = new int[N];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		while (!queue.isEmpty() && turn[N - 1] == 0) {
			int pos = queue.poll();
			for (int i = 1; i <= 6; i++) {
				int t = pos + i;
				if (t < N && !infLoop[t]) {
					if (road[t] == 0 && turn[t] == 0) {
						turn[t] = turn[pos] + 1;
						queue.add(t);
						continue;
					}
					while (road[t] != 0)
						t += road[t];
					if (t > pos + i && turn[t] == 0) {
						turn[t] = turn[pos] + 1;
						queue.add(t);
					}
				}
			}
		}
		System.out.println(turn[N - 1]);
		sc.close();
	}
}