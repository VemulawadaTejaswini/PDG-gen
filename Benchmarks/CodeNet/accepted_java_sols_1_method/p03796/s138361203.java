import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int mod = 1_000_000_007;
		int n = sc.nextInt();
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * i % mod;
		}
		System.out.println(ans);
	}
}