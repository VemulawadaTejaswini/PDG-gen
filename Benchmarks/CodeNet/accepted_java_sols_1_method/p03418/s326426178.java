import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long count = 0;
		if(k == 0) {
			count = n * n;
		} else {
			for(long b = k + 1; b <= n; b++) {
				//n = p * b + rとする
				long p = n / b;
				long r = n % b;
				count += p * Math.max(b - k, 0);
				count += Math.max(r - k + 1, 0);
			}
		}
		System.out.println(count);
	}
}