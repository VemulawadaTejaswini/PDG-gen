import java.util.Scanner;

/**
 * Flag
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int W, H;
		char c;

		W = sc.nextInt();
		H = sc.nextInt();
		c = sc.next().charAt(0);

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if ((i == 0 || i == H - 1) && (j == 0 || j == W - 1)) {
					System.out.print('+');
				} else if (i == 0 || i == H - 1) {
					System.out.print('-');
				} else if (j == 0 || j == W - 1) {
					System.out.print('|');
				} else if (i == H / 2 && j == W / 2) {
					System.out.print(c);
				} else {
					System.out.print('.');
				}
			}
			System.out.println();
		}
	}
}