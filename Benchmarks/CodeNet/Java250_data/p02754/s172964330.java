import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans;
		ans = n / (a + b);
		ans = ans * a;
		n = n % (a + b);
		ans += Math.min(a, n);
		System.out.println(ans);
		sc.close();
	}
}