import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int H = scan.nextInt();
			int W = scan.nextInt();

			if ( H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (i == 0 || i == H-1) {
						System.out.print("#");
						if (j == W-1) System.out.println();
					} else if (i != 0 || i !=H-1) {
						if (j == 0 || j == W-1) {
							System.out.print("#");
						}else {
							System.out.print(".");
						}

						if (j == W-1) {
							System.out.println();
						}
					}
				}
			}
			System.out.println();
		}
		}
	}
