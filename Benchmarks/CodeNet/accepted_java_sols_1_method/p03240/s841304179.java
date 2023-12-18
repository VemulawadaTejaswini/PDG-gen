import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int map[][] = new int[n][3];
		for (int i = 0; i < n; i++) {
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
			map[i][2] = sc.nextInt();
		}
		int h;
		boolean b;
		loop: for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				h = -1;
				b = true;
				for (int k = 0; k < n; k++) {
					if (h == -1) {
						if (map[k][2] > 0) {
							h = map[k][2] + Math.abs(map[k][0] - i) + Math.abs(map[k][1] - j);
							break;
						}
					}
				}

				for (int k = 0; k < n; k++) {
					if (Math.max(h - Math.abs(map[k][0] - i) - Math.abs(map[k][1] - j), 0) != map[k][2]) {
						b = false;
						break;
					}
				}

				if (b) {
					System.out.println(i + " " + j + " " + h);
					break loop;
				}
			}
		}
	}
}
