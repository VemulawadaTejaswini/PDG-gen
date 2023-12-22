import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long res = Long.MAX_VALUE;
		for (long i = 1; i*i <= n; i++) {
			if (n % i == 0) {
				int tmpRes = 
						Math.max(
								String.valueOf(i).length(), 
								String.valueOf(n / i).length());
				res = Math.min(tmpRes, res);
			}
		}
		System.out.println(res);
	}
}