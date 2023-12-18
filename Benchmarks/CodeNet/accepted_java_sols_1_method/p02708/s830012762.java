import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();

		long ans = 0;
		for (long i=k; i<=n+1; i++){
			long min=0;
			long max=0;
			min = i * (i - 1) / 2;
			max = i * (n + n - (i -1)) / 2;
			ans += max - min +1;
		}
		System.out.println(ans % 1000000007);
	}
}