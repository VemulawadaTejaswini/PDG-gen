import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		boolean bool = false;
		for (int i = 0; i < k; i++) {
			if (a < b) {
				if (b < c) {
					bool = true;
					break;
				} else {
					c = c * 2;
				}
			} else {
				b = b * 2;
			}
		}

		if (a < b && b < c) {
			bool = true;
		}
		if (bool) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}