import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int y = sc.nextInt();

		int a = -1, b = -1, c = -1;

		loop: for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				int mny = i * 10000 + j * 5000 + (n - i - j) * 1000;
				if (mny == y) {
					a = i;
					b = j;
					c = n - i - j;
					break loop;
				}
			}
		}

		System.out.println(a + " " + b + " " + c);

		sc.close();
	}
}