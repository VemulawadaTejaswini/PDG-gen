import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 && w == 0)
				break;
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (i == 1 || i == h) {
						System.out.print("#");
					} else {
						if (j == 1 || j == w) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}

					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}

}

