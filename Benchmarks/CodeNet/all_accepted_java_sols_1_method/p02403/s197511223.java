import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			int H = scn.nextInt();
			int W = scn.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

