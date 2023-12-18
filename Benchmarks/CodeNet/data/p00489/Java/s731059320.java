
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Team[] teams = new Team[n];
		for (int i = 0; i < n; i++)
			teams[i] = new Team(i, 0);
		for (int i = 0; i < n * (n - 1) / 2; i++) {
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt() - 1;
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			if (c > d)
				teams[a].ten += 3;
			else if (c < d)
				teams[b].ten += 3;
			else {
				teams[a].ten++;
				teams[b].ten++;
			}
		}
		Arrays.sort(teams);
		int[] rank = new int[n];
		rank[teams[0].name] = 1;
		int r = 0;
		for (int i = 1; i < n; i++) {
			if (teams[i].ten == teams[i - 1].ten)
				r++;
			else
				r = 0;
			rank[teams[i].name] = i - r + 1;
		}
		for (int ans : rank)
			System.out.println(ans);
	}

	class Team implements Comparable<Team> {
		int name, ten;

		public Team(int name, int ten) {
			super();
			this.name = name;
			this.ten = ten;
		}

		@Override
		public int compareTo(Team o) {
			return o.ten - ten;
		}

	}
}