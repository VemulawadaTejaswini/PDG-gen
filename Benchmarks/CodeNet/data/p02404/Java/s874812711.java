import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H;
		int W;
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (i == 0 || i + 1 == H) {
						System.out.print("#");
					} else if (j == 0 || j + 1 == W) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
