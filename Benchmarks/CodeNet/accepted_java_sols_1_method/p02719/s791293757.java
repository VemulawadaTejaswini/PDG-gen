import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long n, k;
		long ans = 0;
		Scanner scan = new Scanner(System.in);

		n = scan.nextLong();
		k = scan.nextLong();

		long a = n % k;

		if(a == 0) {
			System.out.println(0);
		} else {
			System.out.println(Math.min(a, Math.abs(a-k)));
		}
	}
}
