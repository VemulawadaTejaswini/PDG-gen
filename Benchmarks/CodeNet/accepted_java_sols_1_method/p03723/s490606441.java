import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();

		int ans = 0;
		int a2, b2, c2;

		while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
			if (a == b && b == c) {
				ans = -1;
				break;
			}

			a2 = b / 2 + c / 2;
			b2 = a / 2 + c / 2;
			c2 = a / 2 + b / 2;

			a = a2;
			b = b2;
			c = c2;

			ans++;
		}

		System.out.println(ans);
	}

}