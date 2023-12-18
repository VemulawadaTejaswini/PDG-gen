import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] t = sc.nextLine().split(" ");
		long n = Long.parseLong(t[0]);
		long k = Long.parseLong(t[1]);

		long min = Math.min(n, n % k);
		min = Math.min(min, (n % k) + k);
		min = Math.min(min, Math.abs((n % k) - k));

		System.out.println(min);
	}
}
