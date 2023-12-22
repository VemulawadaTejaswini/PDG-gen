import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] s = new char[h][];

		for (int i = 0; i < h; i++) {
			String line = sc.next();
			s[i] = new char[w];
			for (int j = 0; j < w; j++) {

				s[i][j] = line.charAt(j);
			}
		}

		int[][] r = new int[h][];

		for (int i = 0; i < h; i++) {
			r[i] = new int[w];
			for (int j = 0; j < w; j++) {
				if (s[i][j] != '#') {
					int ww = 0;
					for (int ii = i - 1; ii <= i + 1; ii++) {
						for (int jj = j - 1; jj <= j + 1; jj++) {
							if (ii >= 0 && ii < h && jj >= 0 && jj < w) {
								if (s[ii][jj] == '#') {
									ww++;
								}
							}
						}
					}
					r[i][j] = ww;
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] != '#') {
					s[i][j] = (char) ('0' + r[i][j]);
				}
				System.out.print(s[i][j]);
			}
			System.out.println();
		}

	}

}
