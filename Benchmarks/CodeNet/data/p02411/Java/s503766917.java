import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();

			if ((m == -1) && (f == -1) && (r == -1)) {
				break;
			}
			else {

				if (m + f > 80) {
					System.out.println("A");
				}
				else if ((65 <= m + f) && (m + f < 80)) {
					System.out.println("B");
				}
				else if ((50 <= m + f) && (m + f < 60)) {
					System.out.println("C");
				}
				else if ((30 <= m + f) && (m + f < 50) && (r >= 50)) {
					System.out.println("C");
				}
				else if ((30 <= m + f) && (m + f < 50)) {
					System.out.println("D");
				}
				else if ((m + f < 30)) {
					System.out.println("F");
				}

				// System.out.println(m + " " + f + " " + r);
			}
		}

	}

}