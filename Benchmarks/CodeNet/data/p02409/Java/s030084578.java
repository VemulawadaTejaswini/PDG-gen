import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[][][] list = new int[4][3][10];

		for (int i = 0; i < length; i++) {
			list[scanner.nextInt() - 1][scanner.nextInt() - 1][scanner.nextInt() - 1] += scanner.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < 3; i2++) {
				for (int i3 = 0; i3 < 10; i3++) {
					System.out.print(" " + list[i][i2][i3]);
				}

				System.out.println();
			}

			if (i != 3)
				System.out.println("####################");
		}
	}
}