import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		int n = sc.nextInt();
		long ans = 0;

		for (int i = 0; i < n; i++) {
			ans += i;
		}

		System.out.println(ans);

		sc.close();
	}
}
