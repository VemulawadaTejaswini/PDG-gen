import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b && b == c && a % 2 == 0) {
			System.out.println(-1);
			return;
		}

		int ans = 0;
		while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 ) {
			int x = a;
			int y = b;
			int z = c;
			a = y / 2 + z / 2;
			b = x / 2 + z / 2;
			c = x / 2 + y / 2;
			ans++;
		}

		System.out.println(ans);

		sc.close();
	}

}
