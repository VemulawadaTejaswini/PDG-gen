import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Player implements Comparable<Player>{
		int number;
		int fish;

		public int compareTo(Player o) {
			return this.fish == o.fish ? this.number - o.number : o.fish - this.fish;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		Player p[];

		n = sc.nextInt();
		m = sc.nextInt();
		p = new Player[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Player();
			p[i].number = i + 1;
		}
		for (int i = 0; i < m; i++) {
			int number = sc.nextInt();
			int fish = sc.nextInt();
			for (int j = 0; j < n; j++) {
				if (p[j].number == number) {
					p[j].fish += fish;
				}
			}
			Arrays.sort(p);
			System.out.println(p[0].number + " " + p[0].fish);
		}
	}
}