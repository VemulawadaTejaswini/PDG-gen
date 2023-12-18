import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			if (N == 0) break;
			Country[] cs = new Country[N];
			for (int i = 0; i < N; ++i) {
				cs[i] = new Country();
			}
			Arrays.sort(cs);
			boolean ok = true;
			while (cs[N - 1].p > 0) {
				if (cs[N - 1].p - cs[0].p > D) {
					ok = false;
					break;
				}
				cs[N - 1].p -= cs[N - 1].m[cs[N - 1].pos];
				cs[N - 1].pos++;
				Arrays.sort(cs);
			}
			System.out.println(ok ? "Yes" : "No");
		}
	}

	static class Country implements Comparable<Country> {
		int[] m;
		int p = 0;
		int pos = 0;

		Country() {
			int s = sc.nextInt();
			m = new int[s];
			for (int i = 0; i < s; ++i) {
				m[i] = sc.nextInt();
				p += m[i];
			}
		}

		public int compareTo(Country o) {
			if (this.p == o.p) {
				int tf = this.pos == this.m.length ? 0 : this.m[this.pos];
				int of = o.pos == o.m.length ? 0 : o.m[o.pos];
				return of - tf;
			}
			return this.p - o.p;
		}
	}

}