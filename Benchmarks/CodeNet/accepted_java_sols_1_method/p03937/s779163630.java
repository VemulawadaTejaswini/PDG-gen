import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		int cnt = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == '#') {
					cnt++;
				}
			}
		}
		System.out.println((cnt == h + w - 1) ? "Possible" : "Impossible");

	}
}
