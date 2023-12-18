import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				for (int k = 0; k < W; k++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
