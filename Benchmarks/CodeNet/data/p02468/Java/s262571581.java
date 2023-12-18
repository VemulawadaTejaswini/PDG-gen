import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int MOD = 1000000007;
		
		int m = sc.nextInt();
		int n = sc.nextInt();

		long ret = 1;
		while (n > 0) {
			if (n % 2 == 1) {
				ret = ret * m % MOD;
			}
			m = (int)((long)m * m % MOD);
			n /= 2;
		}

		System.out.println(ret);

		sc.close();
	}
}