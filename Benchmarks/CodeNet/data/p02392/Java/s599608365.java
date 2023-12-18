import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		if (0 <= a && a <= 100 && 0 <= b && b <= 100 && 0 <= c && c <= 100) {
			if (a < b && b < c) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}