import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			} else {
				for (int i = 0; i < H - 2; i++) {
					if (i == 0) {
						for (int j = 0; j < W; j++) {
							System.out.print("#");
						}
						System.out.println("");
					}
					for (int j = 0; j < W; j++) {
						if (j == 0) {
							System.out.print("#");
						}
						if (j < W - 2) {
							System.out.print(".");
						}
						if (j == W - 2)
							System.out.print("#");
					}
					System.out.println("");
					if (i == H-3)
						for (int j = 0; j < W; j++) {
							System.out.print("#");
						}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
