import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static class Player implements Comparable<Player> {
		int number;
		int socre;

		public int compareTo(Player o) {
			return o.socre - this.socre;
		}
	}

	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Player player[];

		while (true) {
			n = sc.nextInt();
			sc.nextLine();
			if (n == 0) {
				break;
			}
			player = new Player[n];
			for (int i = 0; i < n; i++) {
				String s[] = sc.nextLine().split(" ");
				player[i] = new Player();
				player[i].number = Integer.valueOf(s[0]);
				int index = 1;
				for (int j = 0; j < 10; j++) {
					if (j != 9) {
						if (Integer.valueOf(s[index]) == 10) {
							player[i].socre += Integer.valueOf(s[index]) + Integer.valueOf(s[index + 1]) + Integer.valueOf(s[index + 2]);
							index += 1;
						} else if (Integer.valueOf(s[index]) + Integer.valueOf(s[index + 1]) == 10) {
							player[i].socre += Integer.valueOf(s[index]) + Integer.valueOf(s[index + 1]) + Integer.valueOf(s[index + 2]);
							index += 2;
						} else {
							player[i].socre += Integer.valueOf(s[index]) + Integer.valueOf(s[index + 1]);
							index += 2;
						}
					} else {
						player[i].socre += Integer.valueOf(s[index]) + Integer.valueOf(s[index + 1]);
						if (index + 2 < s.length) {
							player[i].socre += Integer.valueOf(s[index + 2]);
						}
					}
				}
			}
			Arrays.sort(player);
			for (int i = 0; i < n; i++) {
				System.out.println(player[i].number + " " + player[i].socre);
			}
		}
	}
}