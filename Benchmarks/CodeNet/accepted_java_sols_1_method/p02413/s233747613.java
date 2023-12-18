import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int r = sc.nextInt();
		final int c = sc.nextInt();
		int[][] table = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int v = sc.nextInt();
				table[i][j] = v;
				table[i][c] += v;
				table[r][j] += v;
				table[r][c] += v;
			}
		}
		sc.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				sb.append(table[i][j]);
				if (j == c) {
					sb.append("\n");
				} else {
					sb.append(" ");
				}
			}
		}
		System.out.print(sb);
	}
}