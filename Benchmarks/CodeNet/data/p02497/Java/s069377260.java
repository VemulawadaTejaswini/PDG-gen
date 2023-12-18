import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0, j = 0, m = 0, x, y;
		Scanner sc = new Scanner(System.in);
		do {

			i = sc.nextInt();
			j = sc.nextInt();
			m = sc.nextInt();

			if (i > 50 || j > 50 || m > 100) {
				break;
			} else {
				if (i == -1 || j == -1)
					System.out.println("F");
				else if ((i + j) >= 80)
					System.out.println("A");
				else if ((i + j) < 80 && (i + j) >= 65)
					System.out.println("B");
				else if ((i + j) >= 50 && (i + j) < 65)
					System.out.println("C");
				else if ((i + j) >= 30 && (i + j) < 50) {
					if (m >= 50)
						System.out.println("C");
					else
						System.out.println("D");
				} else
					System.out.println("F");
			}
		} while (i != -1 && j != -1 && m != -1);
	}
}