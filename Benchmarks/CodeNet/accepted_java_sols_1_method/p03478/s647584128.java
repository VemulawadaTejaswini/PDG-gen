import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans = 0;

		for (int i = 1; i <= N; ++i) {

			int n = i;
			int sum = 0;

			while (n > 0) {

				sum = sum + n % 10;
				n = n / 10;
			}

			if (A <= sum && sum <= B) {

				ans = ans + i;
			}

		}

		// 出力
		System.out.println(ans);
	}
}