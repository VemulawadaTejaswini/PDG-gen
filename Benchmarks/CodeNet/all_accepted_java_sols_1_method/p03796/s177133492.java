import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 回数
		int n = in.nextInt();
		// answer
		long ans = 1;
		long max = 123456789123L;
		if ( n <= 100000) {
			for (int i = 1; i <= n; i++) {
				ans = ans * i;
				if (max < ans) {
					ans = ans % (1000000000+7);
				}
			}
		}
		System.out.println(ans);
	}
}