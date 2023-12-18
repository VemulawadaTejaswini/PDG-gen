import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[] dh = { 1, -1, 0, 0 };
		int[] dw = { 0, 0, 1, -1 };
		char map[][] = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		int hh, ww;
		boolean b = true, bb;
		loop: for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == '#') {
					bb = false;
					for (int k = 0; k < 4; k++) {
						hh = i + dh[k];
						ww = j + dw[k];
						if (hh >= 0 && hh < h && ww >= 0 && ww < w) {
							if (map[hh][ww] == '#') {
								bb = true;
							}
						}
					}
					if (!bb) {
						b = false;
						break loop;
					}
				}

			}
		}

		if (b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
