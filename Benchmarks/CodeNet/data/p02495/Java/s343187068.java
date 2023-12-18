import java.util.Scanner;

public class kadai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int k = 0;

			if (H == 0 && W == 0) {
				break;
			}

			for (int h = 1; h <= H; h++) {
				for (int w = 1; w <= W; w++) {
					
					if (h%2 == 1) {
						if (k%2 == 0)
							System.out.print("#");
						else
							System.out.print(".");
						k++;
					}
					else {
						if (k%2 == 0)
							System.out.print(".");
						else
							System.out.print("#");
						k++;
					}
				}
				k = 0;
				System.out.println("");
			}
			System.out.println("");

		}
	}
}