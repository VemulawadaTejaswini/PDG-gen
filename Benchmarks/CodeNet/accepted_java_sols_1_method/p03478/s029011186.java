import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int x, ans = 0;
		for (int i = 1; i <= n; i++) {
			x = i / 10000 + i % 10000 / 1000 + i % 1000 / 100 + i % 100 / 10 + i % 10;
			if (x >= a && b >= x) {
				ans += i;
			}
		}
		System.out.println(ans);

	}
}
