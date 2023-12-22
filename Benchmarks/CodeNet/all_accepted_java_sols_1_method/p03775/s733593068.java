
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = String.valueOf(N).length();
		for (long A = 1; A * A <= N; A++) {
			if (N % A != 0) {
				continue;
			}
			long B = N / A;
			int tmp = Math.max(String.valueOf(A).length(), String.valueOf(B).length());
			if (ans > tmp) {
				ans = tmp;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}