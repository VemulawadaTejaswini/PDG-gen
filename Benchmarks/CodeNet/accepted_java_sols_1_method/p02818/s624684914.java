import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		sc.close();

		long result1 = Math.max(0, a - k);
		long result2 = Math.max(0, Math.min(a + b - k, b));
		System.out.println(String.format("%d %d", result1, result2));
	}
}
