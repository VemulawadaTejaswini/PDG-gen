
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
			int D = scanner.nextInt();
			int N = scanner.nextInt();
			if ((D | N) == 0)
				break;
			Ju[] jus = new Ju[N];
			for (int i = 0; i < N; i++) {
				int a = scanner.nextInt();
				int e = scanner.nextInt();
				int r = scanner.nextInt();
				jus[i] = new Ju(a, e, r);
			}
			PriorityQueue<Ju> pq = new PriorityQueue<Ju>();
			pq.offer(new Ju(D, 0, 0));
			String ans = "NA";
			while (!pq.isEmpty()) {
				Ju ju = pq.poll();
				if (ju.a <= 0) {
					ans = String.valueOf(ju.r);
					break;
				}
				for (Ju j : jus) {
					if (ju.e >= j.r) {
						pq.offer(new Ju(ju.a - j.a, ju.e + j.e, ju.r + 1));
					}
				}
			}
			System.out.println(ans);

		}
	}

	class Ju implements Comparable<Ju> {
		int a, e, r;

		public Ju(int a, int e, int r) {
			super();
			this.a = a;
			this.e = e;
			this.r = r;
		}
		

		@Override
		public String toString() {
			return "Ju [a=" + a + ", e=" + e + ", r=" + r + "]";
		}


		@Override
		public int compareTo(Ju o) {
			if (this.r == o.r)
				return this.a - o.a;
			return this.r - o.r;
		}

	}
}