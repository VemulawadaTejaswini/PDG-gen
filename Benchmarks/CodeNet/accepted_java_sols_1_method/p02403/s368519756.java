import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {

			int h = in.nextInt();
			int w = in.nextInt();

			if (h == 0 && w == 0) {
				break;
			} else {

				for (int i = 0; i < h; i++) {

					for (int n = 0; n < w; n++) {

						System.out.print("#");
					}

					System.out.println();
				}

				System.out.println();
			}
		}
	}
}