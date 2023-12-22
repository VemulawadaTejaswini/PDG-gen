import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt(), c = scanner.nextInt(), total = 0;

		int[][] input = new int[r][c];
		int[] outputR = new int[r];
		int[] outputC = new int[c];

		for (int i = 0; i < r; i++)
			for (int i2 = 0; i2 < c; i2++)
				input[i][i2] = scanner.nextInt();

		for (int i = 0; i < r; i++) {
			for (int i2 = 0; i2 < c; i2++) {
				outputR[i] += input[i][i2];
				System.out.print(input[i][i2] + " ");
			}

			System.out.println(outputR[i]);
		}

		for (int i = 0; i < c; i++) {
			for (int i2 = 0; i2 < r; i2++)
				outputC[i] += input[i2][i];

			total += outputC[i];
			System.out.print(outputC[i] + " ");
		}

		System.out.println(total);
	}
}