import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		String ans = "NG";

		for (int i = 1; i <= 1000; i++) {

			int n = K * i;

			if (A <= n && n <= B) {
				ans = "OK";
				break;
			}
		}

		// 出力
		System.out.println(ans);
	}
}