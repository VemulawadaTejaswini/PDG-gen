import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long K = sc.nextLong();

		long ans = 0;
		if (K%2 != 0) {
			long a = N/K;
			ans = a*a*a;
		} else {
			long a= N/K;
			long b = (N + K/2)/K;
			ans = a*a*a + b*b*b;
		}
		System.out.println(ans);
	}
}
