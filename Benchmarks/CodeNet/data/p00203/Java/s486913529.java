import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h;
		int map[][];
		int cnt[][];

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			map = new int[h][w];
			cnt = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for (int j = 0; j < w; j++) {
				if (map[h - 1][j] == 0) {
					cnt[h - 1][j] = 1;
				}
			}
			
			int sum;
			for (int i = h - 2; 0 <= i; i--) {
				for (int j = 0; j < w; j++) {
					sum = 0;
					if (map[i][j] == 0) {
						if (j + 1 < w && map[i + 1][j + 1] == 0) {
							sum += cnt[i + 1][j + 1];
						}
						if (0 <= j - 1 && map[i + 1][j - 1] == 0) {
							sum += cnt[i + 1][j - 1];
						}
						if (map[i + 1][j] != 1) {
							sum += cnt[i + 1][j];
						}
					} else if (map[i][j] == 2) {
						if (i + 2 < h) {
							sum += cnt[i + 2][j];
						} else {
							sum = 1;
						}
					}
					cnt[i][j] = sum;
				}
			}
			sum = 0;
			for (int j = 0; j < w; j++) {
				sum += cnt[0][j];
			}
			System.out.println(sum);
		}
	}
}