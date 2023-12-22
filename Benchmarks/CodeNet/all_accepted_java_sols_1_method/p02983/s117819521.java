import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		sc.close();

		int a = l / 2019;
		int b = r / 2019;
		if (a < b) {
			System.out.println(0);
			return;
		}
		l %= 2019;
		r %= 2019;
		if (l >= r) {
			System.out.println(0);
			return;
		}

		int ans = Integer.MAX_VALUE;
		for (int i = l; i < r; i++) {
			for (int j = i + 1; j <= r; j++) {
				ans = Math.min(ans, i * j % 2019);
			}
		}
		System.out.println(ans);
	}
}
