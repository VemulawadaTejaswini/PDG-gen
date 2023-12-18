import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			Team[] teams = new Team[N];
			for (int i = 0; i < N; ++i) {
				int id = sc.nextInt();
				int u = sc.nextInt();
				int a = sc.nextInt();
				int p = sc.nextInt();
				teams[i] = new Team(id, u, a, p);
			}
			Arrays.sort(teams);
			int[] count = new int[1001];
			int pass = 0;
			for (int i = 0; i < N; ++i) {
				Team t = teams[i];
				if ((pass < 10 && count[t.u] < 3) || (pass < 20 && count[t.u] < 2) || (pass < 26 && count[t.u] < 1)) {
					++pass;
					count[t.u]++;
					System.out.println(t.id);
				}
			}
		}
	}

	static class Team implements Comparable<Team> {
		int id, u, a, p;

		Team(int id, int u, int a, int p) {
			this.id = id;
			this.u = u;
			this.a = a;
			this.p = p;
		}

		public int compareTo(Team o) {
			if (this.a != o.a) return o.a - this.a;
			if (this.p != o.p) return this.p - o.p;
			return this.id - o.id;
		}
	}
}