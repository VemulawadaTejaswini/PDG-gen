import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		long ans = Math.min(n, m / 2);
		m -= ans * 2;
		ans += m / 4;
		System.out.println(ans);
	}
}
