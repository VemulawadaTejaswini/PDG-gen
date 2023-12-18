
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			String[] array = input.split(" ");
			int h = Integer.parseInt(array[0]);
			int w = Integer.parseInt(array[1]);
			if (h == 0 && w == 0) {
				System.exit(0);
			}
			for (int i = 0; i < h; i++) {
				if (i == 0 || i == h - 1) {
					for (int j = 0; j < w; j++) {
						System.out.print("#");
					}
				} else {
					for (int j = 0; j < w; j++) {
						if (j == 0 || j == w - 1) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}

				}
				System.out.print("\n");
			}
			System.out.print("\n");

		}
	}
}