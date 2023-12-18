
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int R = scanner.nextInt();
		int L = scanner.nextInt();
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		int[] s = new int[N];
		List<Pair> list = new ArrayList<Main.Pair>();

		for (int i = 0; i < N; i++) {
			pq.offer(new Pair(0, i));
			list.add(new Pair(0, i));
		}
		int u = 0;
		int t = 0;
		int d = 0;
		int x = 0;
		for (int i = 0; i <= R; i++) {
			if (i == R)
				t = L;
			else {
				d = scanner.nextInt() - 1;
				t = scanner.nextInt();
				x = scanner.nextInt();
			}
			while (true) {
				Pair p = pq.peek();
				if (s[p.s] == p.f) {
					list.get(p.s).f = list.get(p.s).f + t - u;
					break;
				}
				pq.poll();
			}
			if (i == R)
				break;
			s[d] += x;
			pq.offer(new Pair(s[d], d));
			u = t;
		}
		Collections.sort(list);
		System.out.println(list.get(0).s + 1);
	}

	class Pair implements Comparable<Pair> {
		int f, s;

		public Pair(int f, int s) {
			super();
			this.f = f;
			this.s = s;
		}

		@Override
		public String toString() {
			return "Pair [f=" + f + ", s=" + s + "]";
		}

		@Override
		public int compareTo(Pair o) {
			if (o.f == this.f)
				return this.s - o.s;
			return o.f - this.f;
		}

	}
}