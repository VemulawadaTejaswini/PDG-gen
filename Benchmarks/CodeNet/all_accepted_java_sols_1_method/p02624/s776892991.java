import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long ans = 0;
		for (long i = 1; i <= N; i++) {
			long x = N / i;
			ans += i * x * (x + 1) / 2;
		}
		System.out.println(ans);
	}
}