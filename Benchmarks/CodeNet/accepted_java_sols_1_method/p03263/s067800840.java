import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a[][] = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int hh = 0, ww = 0, cnt = 0;
		boolean b = false;
		for (int i = 0; i < h; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < w; j++) {
					if (b) {
						a[i][j]++;
						sb.append(hh + " " + ww + " " + (i + 1) + " " + (j + 1) + "\n");
						b = false;
						cnt++;
					}
					if (a[i][j] % 2 != 0) {
						hh = i + 1;
						ww = j + 1;
						b = true;
					} else {

					}
				}
			} else {
				for (int j = w - 1; j >= 0; j--) {
					if (b) {
						a[i][j]++;
						sb.append(hh + " " + ww + " " + (i + 1) + " " + (j + 1) + "\n");
						b = false;
						cnt++;
					}
					if (a[i][j] % 2 != 0) {
						hh = i + 1;
						ww = j + 1;
						b = true;
					} else {

					}
				}
			}
		}

		System.out.println(cnt);
		System.out.print(sb);
	}
}
