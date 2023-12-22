import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();

		char[][] c = new char[w][h * 2];
		for (int i = 0; i < h * 2; i += 2) {
			String s = scanner.next();
			for (int j = 0; j < w; j++) {

				c[j][i] = s.charAt(j);
				c[j][i + 1] = c[j][i];

			}
		}

		for (int i = 0; i < (2 * h); i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(c[j][i]);
			}
			System.out.println();
		}

	}
}
