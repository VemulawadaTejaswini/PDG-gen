import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] c = new char[H][W];
		for (int i = 0; i < H; i++) {
			c[i] = sc.next().toCharArray();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] == '#') {
					sb.append('#');
					continue;
				}
				int count = 0;
				if (i + 1 < c.length && c[i + 1][j] == '#') {
					count++;
				}
				if (i - 1 >= 0 && c[i - 1][j] == '#') {
					count++;
				}
				if (j + 1 < c[i].length && c[i][j + 1] == '#') {
					count++;
				}
				if (j - 1 >= 0 && c[i][j - 1] == '#') {
					count++;
				}
				if (i + 1 < c.length && j + 1 < c[i].length && c[i + 1][j + 1] == '#') {
					count++;
				}
				if (i - 1 >= 0 && j - 1 >= 0 && c[i - 1][j - 1] == '#') {
					count++;
				}
				if (i + 1 < c.length && j - 1 >= 0 && c[i + 1][j - 1] == '#') {
					count++;
				}
				if (i - 1 >= 0 && j + 1 < c[i].length && c[i - 1][j + 1] == '#') {
					count++;
				}
				sb.append(count);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}