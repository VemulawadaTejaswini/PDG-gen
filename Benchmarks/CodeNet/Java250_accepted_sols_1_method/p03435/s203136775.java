import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int[][] c = new int[3][];
		for (int i = 0; i < 3; i++) {
			c[i] = new int[3];
			for (int j = 0; j < 3; j++) {
				c[i][j] = stdin.nextInt();
			}
		}

		String result = "No";
		int a2 = c[1][0] - c[0][0];
		int a3 = c[2][0] - c[0][0];
		if ((c[1][1] == (a2 + c[0][1]))
			&& (c[1][2] == (a2 + c[0][2])) && (c[2][1] == (a3 + c[0][1])) && (c[2][2] == (a3 + c[0][2]))) {
			result = "Yes";
		}

		System.out.println(result);
	}

}
