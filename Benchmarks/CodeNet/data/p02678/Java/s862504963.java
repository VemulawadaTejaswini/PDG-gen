import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			edge.get(a).add(b);
			edge.get(b).add(a);
		}

		Queue<Integer> q = new ArrayDeque<>();
		q.add(0);

		boolean used[] = new boolean[n];
		used[0] = true;

		int pred[] = new int[n];

		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int to : edge.get(cur)) {
				if (!used[to]) {
					pred[to] = cur;
					used[to] = true;
					q.add(to);
				}
			}
		}

		System.out.println("Yes");
		for (int i = 1; i < n; i++) {
			System.out.println(pred[i] + 1);
		}
	}
}
