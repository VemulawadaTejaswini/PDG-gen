

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, w;
		while (true) {
			h = scan.nextInt();
			w = scan.nextInt();
			if (h + w == 0) {
				break;
			}
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (i % 2 == 0) {
						if (j % 2 == 1) {
							System.out.print(".");
						} else {
							System.out.print("#");
						}
					} else {
						if (j % 2 == 1) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

}