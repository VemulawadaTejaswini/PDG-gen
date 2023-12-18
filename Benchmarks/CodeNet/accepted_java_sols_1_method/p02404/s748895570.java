import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (; sc.hasNext();) {

			int i = 0;

			int H = sc.nextInt();
			int W = sc.nextInt();

			if (!(H == 0 && W == 0)) {

				for (i = 0; i < H; i++) {

					if (i == 0 || i == H - 1) {
						for (int j = 0; j < W; j++) {
							System.out.print("#");
						}
						System.out.println("");

					} else {
						for (int j = 0; j < W; j++) {
							if (j == 0 || j == W - 1) {
								System.out.print("#");
							} else {
								System.out.print(".");
							}
						}
						System.out.println("");
					}
				}
			}

			if (H == 0 && W == 0) {
				break;
			}
			System.out.println("");
		}

	}

}

