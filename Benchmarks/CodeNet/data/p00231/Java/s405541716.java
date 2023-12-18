
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			PriorityQueue<P> pq = new PriorityQueue<P>();
			for (int i = 0; i < n; i++) {
				int m = scanner.nextInt();
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				pq.offer(new P(true, m, a));
				pq.offer(new P(false, m, b));
			}
			String ans = "OK";
			int sum = 0;
			while (!pq.isEmpty()) {
				P p = pq.poll();
				if (p.b) {
					sum += p.m;
					if (sum > 150) {
						ans = "NG";
						break;
					}
				} else
					sum -= p.m;
			}
			System.out.println(ans);
		}
	}

	class P implements Comparable<P> {
		boolean b;
		int m, t;

		public P(boolean b, int m, int t) {
			super();
			this.b = b;
			this.m = m;
			this.t = t;
		}

		@Override
		public String toString() {
			return "P [b=" + b + ", m=" + m + ", t=" + t + "]";
		}

		@Override
		public int compareTo(P o) {
			if (this.t == o.t)
				return this.b ? 1 : 0;
			return this.t - o.t;
		}

	}
}