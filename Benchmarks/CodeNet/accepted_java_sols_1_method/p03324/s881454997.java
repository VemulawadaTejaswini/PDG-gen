import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = 0;

		if (b == 100)
			b += 1;

		switch (a) {
		case 0:
			ans = b;
			break;
		case 1:
			ans = 100 * b;
			break;
		case 2:
			ans = 10000 * b;

			break;

		default:
			break;
		}

		System.out.println(ans);

		sc.close();

	}

}
