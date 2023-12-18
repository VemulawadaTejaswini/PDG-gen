

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = 0;
		int y = 0;

		int[] balls = new int[n];
		for (int i = 0; i < n; i++) {
			balls[i] = 1;
		}

		boolean[] red = new boolean[n];
		red[0] = true;

		for (int i = 0; i < m; i++) {
			x = Integer.parseInt(sc.next()) - 1;
			y = Integer.parseInt(sc.next()) - 1;

			if (red[x]) {
				red[y] = true;
			}
			balls[x]--;
			balls[y]++;

			if (balls[x] == 0) {
				red[x] = false;
			}
		}
		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (red[i])
				ans++;
		}

		System.out.println(ans);
	}

}
