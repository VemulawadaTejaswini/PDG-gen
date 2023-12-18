import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long min = 1_000_000_000_000_000_001L;
		for (int i = 0; i < 5; i++) {
			min = Math.min(min, sc.nextLong());
		}
		System.out.println(4 + n / min + ((n % min > 0) ? 1 : 0));
	}
}
