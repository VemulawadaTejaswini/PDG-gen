import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			long ans = 0;
			for (int i = 1; i < N / 2; ++i) {
				if (i * Math.sqrt(2) >= Math.sqrt(N)) break;
				ans += i;
			}
			ans *= 8;
			ans += (N - 1) * 8;
			ans += N * 8;
			System.out.println(ans);
		}
	}
}