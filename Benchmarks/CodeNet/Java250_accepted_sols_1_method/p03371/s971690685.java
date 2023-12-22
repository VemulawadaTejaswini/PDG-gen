import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		if (c * 2 < a + b) {
			int z = Math.min(x, y);
			if (x == y) {
				System.out.println(c * 2 * z);
			} else if (x > y) {
				if (c * 2 < a) {
					z = x;
					System.out.println(c * 2 * z);
				} else {
					System.out.println(c * 2 * z + a * (x - z));
				}
			} else {
				if (c * 2 < b) {
					z = y;
					System.out.println(c * 2 * z);
				} else {
					System.out.println(c * 2 * z + b * (y - z));
				}
			}
		} else {
			System.out.println(a * x + b * y);
		}
	}
}
