import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = 0;
		int f = 0;
		int r = 0;
		while (m != -1 || f != -1 || r != -1) {
			m = scanner.nextInt();
			f = scanner.nextInt();
			r = scanner.nextInt();
			if (m == -1 && f == -1 && r == -1) {
				break;
			} else if (m == -1 || f == -1) {
				System.out.println("F");
			} else if (m + f >= 80) {
				System.out.println("A");
			} else if (m + f >= 65) {
				System.out.println("B");
			} else if (m + f >= 50) {
				System.out.println("C");
			} else if (m + f >= 30) {
				if (r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}

		}
	}
}
