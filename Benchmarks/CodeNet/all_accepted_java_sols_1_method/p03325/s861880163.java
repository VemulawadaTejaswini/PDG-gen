import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			while (a % 2 == 0) {
				ans++;
				a /= 2;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}
