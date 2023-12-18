import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		System.out.println();
		for (int j = 0; j < H; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < W / 2; i++) {
					System.out.printf("#.");
				}
				if (W % 2 == 1) {
					System.out.printf("#");

				}
			} else {
				for (int i = 0; i < W / 2; i++) {
					System.out.printf(".#");
				}
				if (W % 2 == 1) {
					System.out.printf(".");
				}

			}
			System.out.println();
		}
	}
}