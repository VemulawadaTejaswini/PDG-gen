import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		long ab = a + b;
		long ans = n / ab * a;
		ans += Math.min(n % ab, a);
		System.out.println(ans);
	}
}
