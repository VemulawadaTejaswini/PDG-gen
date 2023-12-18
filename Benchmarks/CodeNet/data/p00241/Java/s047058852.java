import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			for (int t = 0; t < n; t++) {

				int[] one = new int[4];
				int[] two = new int[4];

				for (int i = 0; i < 4; i++) {
					one[i] = sc.nextInt();
				}

				for (int i = 0; i < 4; i++) {
					two[i] = sc.nextInt();
				}

				int[] three = new int[4];

				for (int i = 0; i < 4; i++) {
					
					for (int j = 0; j < 4; j++) {
						//System.out.println(one[i] * two[j]);
						switch (i) {
						case 0:
							three[j] += one[i] * two[j];
							break;
						case 1:
							three[j % 2 == 0 ? j + 1 : j - 1] += j % 2 != 0 ? -(one[i] * two[j])
									: one[i] * two[j];
							break;
						case 2:
							three[j + 2 < 4 ? j + 2 : j - 2] += j == 1
									|| j == 2 ? -(one[i] * two[j]) : one[i]
									* two[j];
							break;
						case 3:
							three[3 - j] += j >= 2 ? -(one[i] * two[j])
									: one[i] * two[j];
							break;
						}
					}
				}

				for (int i = 0; i < 4; i++) {
					if (i == 0) {
						System.out.print(three[i]);
					} else {
						System.out.print(" " + three[i]);
					}
				}

				System.out.println();
			}

		}
	}

}