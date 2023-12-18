import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();

		int h = sc.nextInt();
		for (int i = 1; i <= w; i++) {
			for (int k = 1; k <= h; k++) {
				if (i % 2 == 1) {
					System.out.print("#.");
				} else {
					System.out.print(".#");
				}
			}
			System.out.print("\n");
			sc.close();
		}
	}
}