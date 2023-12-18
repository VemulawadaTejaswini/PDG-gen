import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && H == 0) {
				break;
			}
			if ((H < 1 || H > 300) || (W < 1 || W > 300)) {
				System.out.println("");
				continue;
			}
			for (int i = 1; i <= H; i++) {
				if ((i % 2) == 1) {
					for (int j = 1; j <= W; j++) {
						if ((j % 2) == 1)
							System.out.printf("#");
						else
							System.out.printf(".");
					}
				} else {
					for (int j = 1; j <= W; j++) {
						if ((j % 2) == 1)
							System.out.printf(".");
						else
							System.out.printf("#");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}

	}
}