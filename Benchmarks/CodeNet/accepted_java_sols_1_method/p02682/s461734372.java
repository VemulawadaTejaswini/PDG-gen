import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long k = sc.nextInt();
		sc.close();

		long ans = Math.min(a, k);
		k -= a;
		k -= b;
		if (k > 0) {
			ans -= k;
		}
		System.out.println(ans);
	}
}
