import java.util.Scanner;

public class Main {
	static int chocoAmount;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();

		int AandB = a * x + b * y;

		if (x < y) {
			if ((c * x * 2 + (y-x)*b < AandB)&&(c * x * 2 + + (y-x)*b<(c * y * 2))) {
				System.out.println(c * x * 2 + (y-x)*b);
			} else if ((c * y * 2 < AandB)) {
				System.out.println(c * y * 2);
			} else {
				System.out.println(AandB);
			}


		} else {
			if ((c * y * 2 + (x-y)*a < AandB)&&(c * y * 2 + + (x-y)*a <(c * x * 2 ))) {
				System.out.println(c * y * 2 + (x-y)*a);
			} else if ((c * x * 2 < AandB)) {
				System.out.println(c * x * 2);
			} else {
				System.out.println(AandB);
			}
		}
	}
}