import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j, x, y;
		Scanner sc = new Scanner(System.in);
		do {
			i = sc.nextInt();
			j = sc.nextInt();

			for (x = 1; x <= i; x++) {
				for (y = 1; y <= j; y++) {
					System.out.printf("#");
				}
				System.out.println("");
			}
		//	System.out.println("");
		} while (i != 0 && j != 0);
	}
}