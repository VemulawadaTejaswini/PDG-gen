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
		int[] num = new int[N];
		for (int i = 0; i < N && num[N - 1] == 0; i++)
			if (!infLoop[i] && road[i] == 0)
				for (int j = 1; j <= 6; j++) {
					int t = j + i;
					if (t < N && !infLoop[t]) {
						while (road[t] != 0)
							t += road[t];
						if (t <= i)
							continue;
						if (num[t] > 0)
							num[t] = Math.min(num[t], num[i] + 1);
						else
							num[t] = num[i] + 1;
					}
				}
		System.out.println(num[N - 1]);
		sc.close();
	}

}