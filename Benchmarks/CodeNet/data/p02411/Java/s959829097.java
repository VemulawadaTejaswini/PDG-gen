import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = 0;
		int f = 0;
		int r = 0;

		while (true) {
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			int end = m + f + r;
			if (end == -3) {
				break;
			}
			if (m == -1 || f == -1 || m + f < 30) {
				System.out.println("F");
			} else if (m + f >= 80) {
				System.out.println("A");
			} else if (m + f >= 65) {
				System.out.println("B");
			} else if (m + f >= 50) {
				System.out.println("C");
			}

		}

	}

}