import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, m;
		int location[][];
		int count;

		n = scanner.nextInt();
		m = scanner.nextInt();
		while (n + m != 0) {
			count = m;
			location = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
				location[i][j] = scanner.nextInt();
				}
			}
			for (int i = 1; i < n; i++) {
				for (int j = 0; j < m; j++) {
					location[0][j] += location[i][j];
				}
			}
			while (0 <= count) {
				for (int i = 0; i < m; i++) {
					if (location[0][i] == count) {
						System.out.print((i + 1) + " ");
					}
				}
				count--;
			}
			System.out.println();
			n = scanner.nextInt();
			m = scanner.nextInt();
		}
	}
}