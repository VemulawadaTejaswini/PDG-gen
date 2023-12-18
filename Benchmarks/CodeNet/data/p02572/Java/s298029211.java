import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long p = scan.nextLong();
		long ans = 0;
		for (long i = 0; i < N-1; i++) {
			long q = scan.nextLong();
			ans += p * q;
			p += q;
		}
		System.out.println(ans%1000000007);
	}
}