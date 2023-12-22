import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long mod = n % k;
		long result = Math.min(mod, Math.abs(mod - k));
		sc.close();

		System.out.println(result);
	}
}