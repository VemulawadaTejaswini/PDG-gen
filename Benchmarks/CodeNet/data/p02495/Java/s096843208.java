import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int k = 0;

			for (int h = 1; h <= H; h++) {
				for (int w = 1; w <= W; w++) {
					if (k%2 == 0)
						System.out.print("#");
					else
						System.out.print(".");
					k++;
				}
				System.out.println("");
			}
			System.out.println("");

			if (H == 0 && W == 0) {
				break;
			}
		}
	}
}