import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1)
				break;
			if (m == -1 || f == -1) {
				System.out.println("F");
				continue;
			}
			if (80 <= m + f) {
				System.out.println("A");
			} else if (m + f < 80) {
				if (65 <= m + f) {
					System.out.println("B");
				} else if (m + f < 65) {
					if (50 <= m + f) {
						System.out.println("C");
					} else if (m + f < 50) {
						if (30 <= m + f) {
							if (50 <= r) {
								System.out.println("C");
							} else {
								System.out.println("D");
							}
						} else if (m + f < 30) {
							System.out.println("F");
						}
					}
				}
			}
		}
	}
}