import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cnt = new int[n];
		for (int i = 0; i < n; i++) {
			cnt[sc.nextInt()]++;
		}
		sc.close();

		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					if (cnt[i] != 0) {
						System.out.println(0);
						return;
					}
				} else {
					if (cnt[i] != 2) {
						System.out.println(0);
						return;
					}
				}
			}
		} else {
			if (cnt[0] != 1) {
				System.out.println(0);
				return;
			}
			for (int i = 1; i < n; i++) {
				if (i % 2 == 1) {
					if (cnt[i] != 0) {
						System.out.println(0);
						return;
					}
				} else {
					if (cnt[i] != 2) {
						System.out.println(0);
						return;
					}
				}
			}
		}

		long ans = 1;
		for (int i = 0; i < n / 2; i++) {
			ans = ans * 2 % 1000000007;
		}
		System.out.println(ans);
	}
}
