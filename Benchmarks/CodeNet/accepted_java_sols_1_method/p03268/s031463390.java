import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N,K;
		N = sc.nextInt();
		K = sc.nextInt();
		long a,b;
		a = N/K;
		long ans;
		ans = a * a * a;
		if (K % 2 == 0) {

			b = (N+K/2) / K;
			ans += b * b* b;
		}
		System.out.println(ans);
	}
}