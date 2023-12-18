import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			if (n == 0 && m == 0 && a == 0)
				break;
			int[][] amida = new int[1000][n];

			int max = 0;
			for (int i = 0; i < m; i++) {
				int h = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();

				amida[h - 1][p - 1] = i + 1;
				amida[h - 1][q - 1] = i + 1;
				if (h > max)
					max = h;
			}

			// for (int i = 0; i < 1000; i++) {
			// for (int j = 0; j < n; j++) {
			// System.out.print(amida[i][j]);
			// }
			// System.out.println();
			// }

			System.out.println(search(amida, max - 1, a - 1));
		}
		sc.close();
	}

	private static int search(int[][] amida, int max, int a) {
		int ans = 0;
		while (max >= 0 && a >= 0 && a <= amida[max].length) {
			if (amida[max][a] == 0) {
				max = max - 1;
			} else if (a - 1 >= 0 && amida[max][a] == amida[max][a - 1]) {
				a -= 1;
				max -= 1;
			} else if (a + 1 <= amida[max].length
					&& amida[max][a] == amida[max][a + 1]) {
				a += 1;
				max -= 1;
			}
			ans = a + 1;
		}
		return ans;
	}
}