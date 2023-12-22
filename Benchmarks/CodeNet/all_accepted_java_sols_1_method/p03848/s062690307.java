import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a = 1000000007;
		/*
		 * nが奇数のとき
		 * 0 2 2 4 4
		 * 2^((n-1)/2)
		 * nが偶数のとき
		 * 1 1 3 3 5 5
		 * 2^(n/2)
		 */
		int tmp, ans = 1;
		int s[] = new int[n];
		for (int i = 0; i < n; i++) {
			s[sc.nextInt()]++;
		}
		if (n % 2 == 0) {
			for (int i = 1; i < n; i = i + 2) {
				if (s[i] != 2) {
					System.out.println(0);
					return;
				}
			}
			for (int i = 0; i < n / 2; i++) {
				ans = (ans * 2) % a;
			}
		} else {
			if (s[0] != 1) {
				System.out.println(0);
				return;
			}
			for (int i = 2; i < n; i = i + 2) {
				if (s[i] != 2) {
					System.out.println(0);
					return;
				}
			}
			for (int i = 0; i < n / 2; i++) {
				ans = (ans * 2) % a;
			}
		}
		System.out.println(ans);
	}
}
