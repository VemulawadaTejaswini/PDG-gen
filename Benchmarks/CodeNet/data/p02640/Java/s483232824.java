import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();

		if (y > x * 4 || y % 2 == 1 || x > 50 || x >= y || y < x * 2) {
			System.out.println("No");
		} else if (x > 0 && y == 0) {
			System.out.println("No");
		} else if (x > 25 && y > 100) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}