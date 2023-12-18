import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static class Player implements Comparable<Player>{
		int number;
		double time;

		Player(int number, double time) {
			this.number = number;
			this.time = time;
		}

		Player(Player p) {
			this(p.number, p.time);
		}

		public int compareTo(Player o) {
			return (int)(this.time * 100 - o.time * 100);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Player player[] = new Player[24];
		Player toFinal[] = new Player[8];

		for (int i = 0; i < 24; i++) {
			int number = sc.nextInt();
			double time = sc.nextDouble();
			player[i] = new Player(number, time);
		}
		int first, second;
		Arrays.sort(player, 0, 7);
		toFinal[0] = player[0];
		toFinal[1] = player[1];
		Arrays.sort(player, 8, 15);
		toFinal[2] = player[8];
		toFinal[3] = player[9];
		Arrays.sort(player, 16, 23);
		toFinal[4] = player[16];
		toFinal[5] = player[17];
		Player swap = new Player(player[8]);
		player[8] = player[2];
		player[2] = swap;
		swap = new Player(player[9]);
		player[9] = player[3];
		player[3] = swap;
		swap = new Player(player[16]);
		player[16] = player[4];
		player[4] = swap;
		swap = new Player(player[17]);
		player[17] = player[5];
		player[5] = swap;
		Arrays.sort(player, 6, 23);
		toFinal[6] = player[6];
		toFinal[7] = player[7];
		for (int j = 0; j < 8; j++) {
			System.out.println(toFinal[j].number + " " + toFinal[j].time);
		}
	}
}