import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		int p = sc.nextInt();
		for (int i = 1; i < N; i++) {
			int c = sc.nextInt();
			if (p > c) {
				ans += p - c;
				c = p;
			}
			p = c;
		}
		System.out.println(ans);
	}
}
