import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		n %= k;
		if (k > n) {
			n = Math.min(n, Math.abs(n - k));
		}
		System.out.println(n);
	}
}
