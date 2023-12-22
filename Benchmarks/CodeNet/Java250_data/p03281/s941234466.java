import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int ans = 0;
		
		if (n < 105) {
			ans = 0;
		} else if (n < 107) {
			ans = 1;
		} else {
			ans++;
			for (int i = 107; i <= n; i++) {
				if (i % 2 == 0) {
					continue;
				}
				int div = 1;
				int sum = 0;
				while (div <= i) {
					if (i % div == 0) {
						sum++;
					}
					div++;
				}
				if (sum == 8) {
					ans++;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
