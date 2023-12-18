
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long mod = 1000000007;

		long total = 1;
		long without_0 = 1;
		long wo_0and9 = 1;

		for(int i = 0; i < N; i++) {
			total = total * 10 % mod;
			without_0 = without_0 * 9 % mod;
			wo_0and9 = wo_0and9 * 8 % mod;
		}

		long ans = (total - without_0 * 2 % mod + wo_0and9 + mod) % mod;
		System.out.println(ans);
	}
}

