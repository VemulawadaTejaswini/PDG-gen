import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		String s[][] = new String[h][w];

		for (int i = 0; i < h; i++) {
			s[i] = scanner.next().split("");
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j].equals("#")) {
					for (int k = -1; k <= 1; k++) {
						for (int v = -1; v <= 1; v++) {
							try {
								if (!((k == 0 && v == 0) || s[i + k][j + v].equals("#"))) {
									s[i + k][j + v] += ".";
								}
							} catch (Exception e) {

							}
						}
					}
				}

			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j].equals("#")) {
					System.out.print("#");
				} else {
					System.out.print(s[i][j].length() - 1);
				}
			}
			System.out.println("");
		}

	}
}
