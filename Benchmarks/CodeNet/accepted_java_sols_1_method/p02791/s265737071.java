import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long p[] = new long[N];

		long min = sc.nextLong();
		long max = min;

		long ans = 1;

		for (int i = 1; i < p.length; i++) {
			p[i] = sc.nextLong();
			if (min > p[i]) {
				ans++;
				min = p[i];
			}
			if (max < p[i]) {
				max = p[i];
			}
		}
		System.out.println(ans);
	}
}
