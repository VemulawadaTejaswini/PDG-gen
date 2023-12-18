import java.util.*;
import java.util.stream.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (x[i] < K - x[i]) {
				ans += x[i] * 2;
			} else {
				ans += (K - x[i]) * 2;
			}
		}
		System.out.println(ans);
	}
}
