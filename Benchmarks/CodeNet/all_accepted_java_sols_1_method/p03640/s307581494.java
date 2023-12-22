import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] c = new int[h][w];
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int color = 0;
		for (int i = 0; i < h * w; i++) {
			int y = i / w;
			int x = (y % 2 == 1) ? (w - (i % w) - 1) : i % w;
			while (color < a.length && a[color] == 0) color++;
			c[y][x] = color + 1;
			a[color]--;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				sb.append(c[i][j]);
				sb.append(" ");
			}
			sb.append("\n");
		}

		System.out.print(sb.toString());
	}
}
