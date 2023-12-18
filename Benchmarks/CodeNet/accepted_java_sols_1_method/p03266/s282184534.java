import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int k = sc.nextInt();
		long ans = 0, j = 0;

		for (int i = 1; i <= n; i++) {
			if ((i % k != 0) && ((i * 2) % k == 0)) {
				j++;
			}
		}
		
		ans += Math.pow(n / k, 3) + Math.pow(j, 3);

		System.out.println(ans);

		sc.close();
	}
}
