import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long ans = Long.MAX_VALUE;
		for(int x = 1; x <= Math.sqrt(n); x++) {
			if(n % x == 0) {
				long y = n / x;
				ans = Math.min(ans, x+y-2);
			}
		}
		System.out.println(ans);
	}
}