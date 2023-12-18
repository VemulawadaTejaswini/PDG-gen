import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			if (H % 2 == 0) {
				for (int i = 1; i <= H / 2; i++) {
					if (W % 2 == 0) {
						for (int j = 1; j <= W / 2; j++) {
							System.out.print("#.");
						}
						System.out.print("\n");
						for (int k = 1; k <= W / 2; k++) {
							System.out.print(".#");
						}
						System.out.print("\n");
					} else if (W != 1) {
						for (int j = 1; j <= W / 2; j++) {
							System.out.print("#.");
						}
						System.out.print("#\n");
						for (int k = 1; k <= W / 2; k++) {
							System.out.print(".#");
						}
						System.out.printf(".\n");
					} else {
						System.out.print("#\n");
						System.out.print(".\n");
					}
				}
			} else if (H != 1) {
				for (int i = 1; i <= H / 2; i++) {
					if (W % 2 == 0) {
						for (int j = 1; j <= W / 2; j++) {
							System.out.print("#.");
						}
						System.out.print("\n");
						for (int k = 1; k <= W / 2; k++) {
							System.out.print(".#");
						}
						System.out.print("\n");
					} else if (W != 1) {
						for (int j = 1; j <= W / 2; j++) {
							System.out.print("#.");
						}
						System.out.print("#\n");
						for (int k = 1; k <= W / 2; k++) {
							System.out.print(".#");
						}
						System.out.printf(".\n");
					} else {
						System.out.print("#\n");
						System.out.print(".\n");
					}
				}
				if (W % 2 == 0) {
					for (int j = 1; j <= W / 2; j++) {
						System.out.print("#.");
					}
					System.out.print("\n");
				} else if (W != 1) {
					for (int j = 1; j <= W / 2; j++) {
						System.out.print("#.");
					}
					System.out.print("#\n");
				} else {
					System.out.print("#\n");
				}
			} else {
				if (W % 2 == 0) {
					for (int j = 1; j <= W / 2; j++) {
						System.out.print("#.");
					}
					System.out.print("\n");
				} else if (W != 1) {
					for (int j = 1; j <= W / 2; j++) {
						System.out.print("#.");
					}
					System.out.print("#\n");
				} else {
					System.out.print("#\n");
				}
			}
			System.out.print("\n");
		}
	}
}