import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		long x = sc.nextLong();
		long y = sc.nextLong();
		int ans = 1;

		while ((x * 2) <= y) {
			ans++;
			x = x * 2;
		}

		System.out.println(ans);

		sc.close();
	}
}
