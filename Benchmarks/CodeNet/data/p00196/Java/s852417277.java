import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Team implements Comparable<Team>{
		int number;
		String name;
		int win;
		int lose;
		
		Team(int number, String name, int win, int lose) {
			this.number = number;
			this.name = name;
			this.win = win;
			this.lose = lose;
		}
		
		public int compareTo(Team o) {
			if (this.win != o.win) {
				return o.win - this.win;
			} else if (this.lose != o.lose) {
				return this.lose - o.lose;
			} else {
				return this.number - o.number;
			}
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
				String name = sc.next();
				int win = 0;
				int lose = 0;
				String s[] = sc.nextLine().split(" ");
				for (int j = 1; j < n; j++) {
					if (s[j].equals("0")) {
						win++;
					} else if (s[j].equals("1")) {
						lose++;
					}
				}
				team[i] = new Team(i, name, win, lose);
			}
			Arrays.sort(team);
			for (int i = 0; i < n; i++) {
				System.out.println(team[i].name);
			}
		}
	}
}