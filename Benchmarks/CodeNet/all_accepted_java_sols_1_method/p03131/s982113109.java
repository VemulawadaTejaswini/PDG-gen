import java.util.Scanner;

public class Main {

	static long[] ans;
	static boolean[] seen;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int money = 0;
		long ans = 1;
		while (K > 0) {
			if (money > 0 && A < B) {
				money--;
				ans += B;
			} else if (K > 1 && ans >= A && A < B && (B - A > 1)) {
				money++;
				ans -= A;
			} else {
				ans++;
			}
			K--;
		}
		System.out.println(ans);
		in.close();
	}
}