import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int w[], h[];

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}

			h = new int[n];
			w = new int[m];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
			}

			int width = 0;
			int height = 0;
			int x, y;
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					x = j;
					y = i;
					width = height = 0;
					while (true) {
						while (true) {
							if (x == m) {
								break;
							}
							width += w[x];
							x++;
							if (height == width) {
								cnt++;
							}
							if (height < width || x == m) {
								break;
							}
						}
						if (x == m && y == n) {
							break;
						}
						while (true) {
							if (y == n) {
								break;
							}
							height += h[y];
							y++;
							if (width == height) {
								cnt++;
							}
							if (width < height || y == n) {
								break;
							}
						}
						if (x == m && y == n) {
							break;
						}
					}
				}
			}

			System.out.println(cnt);
		}
	}
}