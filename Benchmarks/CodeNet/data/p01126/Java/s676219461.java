import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next()); // ???
		int m = Integer.parseInt(sc.next()); // ?¨?????????°
		int a = Integer.parseInt(sc.next()); // ???????????????
		int maxY = 0;

		int[][] map = new int[n][1000];

		for (int i = 0; i < m+1; i++) {
			int p = Integer.parseInt(sc.next()); // ???
			int q = Integer.parseInt(sc.next()) - 1; // ?¨?????????°
			int r = Integer.parseInt(sc.next()) - 1; // ???????????????

			map[q][1000 - p] = q + 1;
			map[q + 1][1000 - p] = q;
		}
		int x = a;
		int y = 0;
		while (y < 1000) {
			if (map[x][y] != 0) {
				x = x + 1;
			}
			y++;
		}

		System.out.println(x + 1);

	}
}