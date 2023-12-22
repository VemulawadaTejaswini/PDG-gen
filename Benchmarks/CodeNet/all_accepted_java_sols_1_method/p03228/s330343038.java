
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, k;

		a = sc.nextInt();
		b = sc.nextInt();
		k = sc.nextInt();

		for (int i = 0; i < k; ++i) {
			if (i % 2 == 0) {
				if (a % 2 != 0)
					--a;
				b += a / 2;
				a = a - (a / 2);
			} else {
				if (b % 2 != 0)
					--b;
				a += b / 2;
				b = b - (b / 2);
			}
		}

		System.out.println(a + " " + b);

		sc.close();
	}

}
