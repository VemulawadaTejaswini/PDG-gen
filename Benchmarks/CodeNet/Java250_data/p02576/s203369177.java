import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long t = sc.nextLong();
		if(n <= x) {
			System.out.println(t);
			return;
		}
		long ans = 0;
		ans += (n / x) * t;
		n %= x;
		if(n > 0) {
			ans += t;
		}

		sc.close();
		System.out.println(ans);

	}
}

