import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i < 1000) {
			String line = sc.nextLine();
			String[] array = line.split(" ");
			int H = Integer.parseInt(array[0]);
			int W = Integer.parseInt(array[1]);

			if (W == 0 && H == 0) {
				break;

			} else {

				for (int k = 0; k < H; k++) {

					for (int j = 0; j < W; j++) {
						if (k == 0 || k == H - 1) {
							System.out.print("#");

						} else {
							if (j == 0 || j == W - 1) {
								System.out.print("#");

							} else {
								System.out.print(".");

							}
						}

					}
					System.out.println();
				}
				System.out.println();
			}
		}

	}

}