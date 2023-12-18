
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long T = in.nextLong();
		long[] t = new long[N];
		for (int i = 0; i < N; i++) {
			t[i] = in.nextLong();
		}
		long ans = 0;
		for (int i = 0; i < N - 1; i++) {
			ans += Math.min(T, t[i + 1] - t[i]);
		}
		ans += T;
		System.out.println(ans);
		in.close();
	}
}