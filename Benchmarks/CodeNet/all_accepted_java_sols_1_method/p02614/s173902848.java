import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] c = new char[h][w];
		for (int i = 0; i < h; i++) {
			c[i] = sc.next().toCharArray();
		}
		sc.close();

		int h2 = 1 << h;
		int w2 = 1 << w;
		int ans = 0;
		for (int x = 0; x < h2; x++) {
			for (int y = 0; y < w2; y++) {
				int cnt = 0;
				for (int i = 0; i < h; i++) {
					if ((x >> i & 1) == 1) {
						continue;
					}
					for (int j = 0; j < w; j++) {
						if ((y >> j & 1) == 1) {
							continue;
						}
						if (c[i][j] == '#') {
							cnt++;
						}
					}
				}
				if (cnt == k) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
