

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (y % 2 != 0) {
			System.out.println("No");
		} else if (4 * x < y || 2 * x > y) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}
