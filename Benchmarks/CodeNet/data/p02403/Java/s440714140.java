import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H;
		int W;

		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();

			if (H == 0 && W == 0)
				break;

			printRectangle(H, W);

		}

	}

	public static void printRectangle(int H, int W) {
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print("#");

				if (j == (W - 1))
					System.out.println("");
			}
		}
		System.out.println();
	}

}