import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int h = 40;
		final int w = 100;

		System.out.println(h + " " + w);

		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();

		for (int x = 0; x < w; x++) {
			System.out.print("#");
		}
		System.out.println();
		int count = 1;
		for (int y = 1; y < (h / 2); y++) {
			System.out.print("#");
			for (int x = 1; x < (w - 1); x++) {
				if ((count < a) && ((x + y) % 3 == 0)) {
					System.out.print(".");
					count++;
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println("#");
		}

		for (int x = 0; x < w; x++) {
			System.out.print(".");
		}
		System.out.println();
		count = 1;
		for (int y = 1; y < (h / 2); y++) {
			System.out.print(".");
			for (int x = 1; x < (w - 1); x++) {
				if ((count < b) && ((x + y) % 3 == 0)) {
					System.out.print("#");
					count++;
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println(".");
		}
	}
}
