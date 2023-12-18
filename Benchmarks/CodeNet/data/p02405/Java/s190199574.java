import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			if (h == 0 && w == 0) {
				break;
			} else if (1 <= h && h <= 300 && 1 <= w && w <= 300) {
				for (int i = 0; i < h; i++) {
					if (i % 2 == 0) {
						for (int j = 0; j < w; j++) {
							if (j % 2 == 0) {
								System.out.print("#");
							} else {
								System.out.print(".");
							}
						}
						System.out.println();
					} else {
						for (int j = 0; j < w; j++) {
							if (j % 2 == 1) {
								System.out.print("#");
							} else {
								System.out.print(".");
							}
						}
						System.out.println();
					}
				}
			}
		}

	}

}