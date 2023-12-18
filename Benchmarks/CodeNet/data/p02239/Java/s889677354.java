import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		List<List<Integer>> g = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			g.add(new ArrayList<>());

			int u = sc.nextInt() - 1;
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				g.get(u).add(sc.nextInt() - 1);
			}
		}

		sc.close();

		Deque<Integer> q = new ArrayDeque<>();
		int[] d = new int[n];
		Arrays.fill(d, -1);

		q.add(0);
		d[0] = 0;

		while (!q.isEmpty()) {
			int c = q.poll();

			for (int x : g.get(c)) {
				if (d[x] == -1 || d[x] > d[c] + 1) {
					d[x] = d[c] + 1;
					q.add(x);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			out.println((i + 1) + " " + d[i]);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

