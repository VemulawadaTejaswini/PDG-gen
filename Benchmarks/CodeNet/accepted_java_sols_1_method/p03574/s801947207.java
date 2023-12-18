import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();

		String[][] ms = new String[h][w];

		for (int i = 0; i < h; i++) {
			ms[i] = sc.nextLine().split("");
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if ("#".equals(ms[i][j])) {
					continue;
				}

				int bombCount = 0;
				if (i > 0) {
					if (j > 0 && "#".equals(ms[i - 1][j - 1])) {
						bombCount++;
					}
					if ("#".equals(ms[i - 1][j])) {
						bombCount++;
					}
					if (j + 1 < w && "#".equals(ms[i - 1][j + 1])) {
						bombCount++;
					}
				}
				if (i + 1 < h) {
					if (j > 0 && "#".equals(ms[i + 1][j - 1])) {
						bombCount++;
					}
					if ("#".equals(ms[i + 1][j])) {
						bombCount++;
					}
					if (j + 1 < w && "#".equals(ms[i + 1][j + 1])) {
						bombCount++;
					}
				}
				if (j > 0 && "#".equals(ms[i][j - 1])) {
					bombCount++;
				}
				if (j + 1 < w && "#".equals(ms[i][j + 1])) {
					bombCount++;
				}

				ms[i][j] = Integer.toString(bombCount);
			}
		}

		for (String[] sline : ms) {
			System.out.println(String.join("", sline));
		}

		sc.close();
	}
}