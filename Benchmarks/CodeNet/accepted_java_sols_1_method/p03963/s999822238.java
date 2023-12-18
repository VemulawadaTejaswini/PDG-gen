import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ballNumber = sc.nextInt();
		int color = sc.nextInt();
		int paint = 1;

		for (int i = 0; i < ballNumber; i++) {
			if (ballNumber == 1) {
				paint = color;
				break;
			}
			if (i == 0) {
				paint *= color;
			} else {
				paint *= (color -1);
			}
		}
		System.out.println(paint);
		sc.close();
	}
}
