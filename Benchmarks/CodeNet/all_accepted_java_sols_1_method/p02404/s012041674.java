import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			int H = scan.nextInt();
			int W = scan.nextInt();

			if ((H == 0) && (W == 0)) {
				break;
			} 
			else {

				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {

						if ((0 < i && i < H - 1) && (0 < j && j < W - 1)) {
							System.out.print(".");
						} 
						else {
							System.out.print("#");
						}
						
					}
					System.out.println();
				}
			}
			System.out.println();
		}

	}

}