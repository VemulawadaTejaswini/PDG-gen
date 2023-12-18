import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1, y = 1;
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			System.out.printf("\n");
			if (H == 0 && W == 0) {
				break;
			}

			for (int i = 1; i <= H; i++) {
				if (i % 2 == 1) {
					for (int j = 1; j <= W; j++) {
						if (x == 1) {
							System.out.printf("#");
							x = x * -1;
						} else {
							System.out.printf(".");
							x = x * -1;
						}
					}

					System.out.printf("\n");

				} else {
					for (int j = 1; j <= W; j++) {
						if (y == 1) {
							System.out.printf(".");
							y = y * -1;
						} else {
							System.out.printf("#");
							y = y * -1;
						}