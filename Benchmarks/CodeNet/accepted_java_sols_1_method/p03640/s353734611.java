import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int idx1 = 0;
		int idx2 = 0;
		int map[][] = new int[h][w];
		for (int i = 0; i < h; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < w; j++) {
					map[i][j] = idx1 + 1;
					idx2++;
					if (a[idx1] == idx2) {
						idx1++;
						idx2 = 0;
					}
				}
			} else {
				for (int j = w - 1; j >= 0; j--) {
					map[i][j] = idx1 + 1;
					idx2++;
					if (a[idx1] == idx2) {
						idx1++;
						idx2 = 0;
					}
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j == 0) {
					sb.append(map[i][j]);
				} else {
					sb.append(" " + map[i][j]);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}