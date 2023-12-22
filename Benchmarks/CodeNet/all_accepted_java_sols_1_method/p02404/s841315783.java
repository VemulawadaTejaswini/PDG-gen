import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			for(;;) {

				int H = sc.nextInt();
				int W = sc.nextInt();

				if(H == 0 && W == 0) {
					break;
				}

				for(int j = 0; j < H; j++) {

					if((j == 0) || (j == H - 1)) {

						for(int k = 0; k < W; k++) {
							System.out.print("#");
						}

					} else {

						System.out.print("#");
						for(int k = 1; k < W - 1; k++) {
							System.out.print(".");
						}
						System.out.print("#");

					}
					System.out.print('\n');
				}
				System.out.println();
			}
	}
}