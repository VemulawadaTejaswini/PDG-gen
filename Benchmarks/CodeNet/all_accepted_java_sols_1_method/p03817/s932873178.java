import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		long a = x / 11;
		long b = x % 11;
		long ans = 0;
		if (b == 0) {
			ans = a * 2;
		} else if (b <= 6) {
			ans = a * 2 + 1;
		} else {
			ans = a * 2 + 2;
		}
		System.out.println(ans);
	}
}
