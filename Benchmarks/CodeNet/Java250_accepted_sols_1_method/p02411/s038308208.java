import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1) {
				break;
			}

			if (m == -1 || f == -1) {
				System.out.printf("F");
			} else if (m + f >= 80) {
				System.out.printf("A");
			} else if (m + f >= 65) {
				System.out.printf("B");
			} else if (m + f >= 50) {
				System.out.printf("C");
			} else if (m + f >= 30) {
				if (r >= 50) {
					System.out.printf("C");
				} else {
					System.out.printf("D");
				}
			} else {
				System.out.printf("F");
			}
			System.out.printf("\n");

		}
	}
}
