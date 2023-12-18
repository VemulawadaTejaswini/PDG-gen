import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int ans = m + f;
			if (m == -1 && f == -1 && r == -1) {
				break;
			} else if (m == -1 || f == -1) {
				System.out.println("F");
			} else {
				if (ans >= 80) {
					System.out.println("A");
				} else if (ans >= 65) {
					System.out.println("B");
				} else if (ans >= 50) {
					System.out.println("C");
				} else if (ans >= 30) {
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
		sc.close();
	}

}

