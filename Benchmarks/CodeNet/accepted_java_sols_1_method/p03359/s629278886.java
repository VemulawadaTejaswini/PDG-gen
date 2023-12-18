import java.util.Scanner;

public class Main {

	static char[][] c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 定型ループ
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = a - 1;
		if (b >= a) {
			ans += 1;
		}

		System.out.println(ans);
	}
}
