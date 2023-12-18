import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			if (h == 0 || w == 0)
				break;
			else if (h <= 0 && w > 300 && w < 1)
				break;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.printf("#");
				}
				System.out.printf("\n");
			}

			System.out.printf("\n");
		}
	}
}