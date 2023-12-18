import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Team implements Comparable<Team>{
		int number;
		int time;

		Team (int number) {
			this.number = number;
			this.time = 0;
		}

		public int compareTo(Team o) {
			return this.time - o.time;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Team team[];

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			team = new Team[n];
			for (int i = 0; i < n; i++) {
				int number = sc.nextInt();
				team[i] = new Team(number);
				for (int j = 0; j < 8; j++) {
					int k = sc.nextInt();
					if (j % 2 == 0) {
						team[i].time += k * 60;
					} else {
						team[i].time += k;
					}
				}
			}
			Arrays.sort(team);
			System.out.println(team[0].number);
			System.out.println(team[1].number);
			System.out.println(team[team.length - 2].number);
		}
	}
}