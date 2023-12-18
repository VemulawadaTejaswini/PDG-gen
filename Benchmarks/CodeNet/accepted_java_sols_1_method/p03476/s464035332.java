import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] prime = new int[100001];
		prime[0] = 0;
		prime[1] = 0;
		prime[2] = 0;
		prime[3] = 1;
		prime[4] = 1;
		for (int i = 5; i < 100000; i = i + 2) {
			boolean b = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			for (int j = 2; j * j <= (i + 1) / 2; j++) {
				if ((i + 1) / 2 % j == 0) {
					b = false;
					break;
				}
			}
			if (b) {
				prime[i] = prime[i - 1] + 1;
				prime[i + 1] = prime[i];
			} else {
				prime[i] = prime[i - 1];
				prime[i + 1] = prime[i - 1];
			}
		}

		int n = sc.nextInt();
		int l, r, cnt;
		for (int i = 0; i < n; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			sb.append(prime[r] - prime[l-1] + "\n");
		}
		System.out.print(sb);
	}
}
