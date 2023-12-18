

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height, width;
		while (true) {
			height = scan.nextInt();
			width = scan.nextInt();
			if (height == 0 && width == 0) {
				break;
			}
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= width; j++) {
					if ((i > 1 && i < height && j > 1 && j < width)) {
						System.out.print(".");
					} else {
						System.out.print("#");
					}
				}
				System.out.println("");
			}

		}
	}

}