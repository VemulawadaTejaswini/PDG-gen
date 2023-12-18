import java.util.Scanner;

public class PR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int H = sc.nextInt();
			int w = sc.nextInt();
			if (H == 0 && w == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < w; j++) {
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}

	}

}