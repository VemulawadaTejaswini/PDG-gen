import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int T = sc.nextInt();
			int P = sc.nextInt();
			int R = sc.nextInt();
			if (T == 0) break;
			Team[] ts = new Team[T];
			for (int i = 0; i < T; ++i) {
				ts[i] = new Team(i + 1);
			}
			for (int i = 0; i < R; ++i) {
				int tid = sc.nextInt() - 1;
				int pid = sc.nextInt() - 1;
				int time = sc.nextInt();
				if (sc.next().length() == "CORRECT".length()) {
					ts[tid].ac++;
					ts[tid].pena += time + ts[tid].wa[pid] * 1200;
				} else {
					ts[tid].wa[pid]++;
				}
			}
			Arrays.sort(ts);
			for (int i = 0; i < T; ++i) {
				System.out.println(ts[i].tid + " " + ts[i].ac + " " + ts[i].pena);
			}
		}
	}

	static class Team implements Comparable<Team> {
		int ac, pena, tid;
		int[] wa = new int[10];

		Team(int tid) {
			this.tid = tid;
		}

		public int compareTo(Team o) {
			if (this.ac != o.ac) return o.ac - this.ac;
			if (this.pena != o.pena) return this.pena - o.pena;
			return this.tid - o.tid;
		}
	}

}