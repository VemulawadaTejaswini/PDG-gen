import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static class Team implements Comparable<Team> {
		int c,t,i;
		public Team(int c, int t, int i) {
			this.c = c;
			this.t = t;
			this.i = i;
		}
		public int compareTo(Team o) {
			if (this.c - o.c == 0) {
				if (this.t - o.t == 0) {
					if (o.i - this.i > 0)
						return Integer.MAX_VALUE;
					else
						return Integer.MIN_VALUE;
				}
				else
					return this.t - o.t;
			}
			else
				return o.c - this.c;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = Integer.parseInt(sc.next());
			int t = Integer.parseInt(sc.next());
			int p = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			if (m == 0 && t == 0 && p == 0 && r == 0) break;
			Team[] T = new Team[t];
			int[][] miss = new int[t][p];
			for (int i = 0; i < t; i++)
				T[i] = new Team(0, 0, i + 1);
			for (int i = 0; i < r; i++) {
				int mt = Integer.parseInt(sc.next());
				int tt = Integer.parseInt(sc.next()) - 1;
				int pt = Integer.parseInt(sc.next()) - 1;
				int jt = Integer.parseInt(sc.next());
				if (jt != 0)
					miss[tt][pt]++;
				if (jt != 0 || mt > m) continue;
				T[tt].c++;
				T[tt].t += mt + 20 * miss[tt][pt];
			}
			Arrays.sort(T);
			for (int i = 0; i < t; i++) {
				System.out.print(T[i].i);
				if (i != t - 1 && T[i].compareTo(T[i + 1]) == Integer.MIN_VALUE) {
					System.out.print("=");
				}
				else if (i != t - 1)
					System.out.print(",");
				else
					System.out.println();
			}
		}
	}
}
