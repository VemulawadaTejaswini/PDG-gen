import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] c = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		String msg = "Yes";
		for (int i = 1; i < 3; i++) {
			int a = c[0][1] - c[0][0];
			if (c[i][1] - c[i][0] != a) {
				msg = "No";
				break;
			}
			a = c[0][2] - c[0][1];
			if (c[i][2] - c[i][1] != a) {
				msg = "No";
				break;
			}
			a = c[1][0] - c[0][0];
			if (c[1][i] - c[0][i] != a) {
				msg = "No";
				break;
			}
			a = c[2][0] - c[1][0];
			if (c[2][i] - c[1][i] != a) {
				msg = "No";
				break;
			}
		}

		System.out.println(msg);
		sc.close();
	}
}