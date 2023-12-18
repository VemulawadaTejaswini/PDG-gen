
import java.util.Scanner;

public class Main {

	static long mod = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] t = sc.nextLine().split(" ");
		long a = Long.parseLong(t[0]);
		long b = Long.parseLong(t[1]);

		long ans = 0;

		for(int i = (int)b; i <= a + 1; i++) {
			ans += i * (a - i + 1) + 1;
			ans %= mod;
		}


		System.out.println(ans);
	}
}