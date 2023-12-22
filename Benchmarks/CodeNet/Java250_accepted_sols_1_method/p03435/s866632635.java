import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] c = new int[3][3];
		boolean b = true;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (b) {
					b = c[i][j] - c[i][j + 1] == c[i + 1][j] - c[i + 1][j + 1];
				}
			}

		}

		String str = b ? "Yes" : "No";
		System.out.println(str);
	}
}
