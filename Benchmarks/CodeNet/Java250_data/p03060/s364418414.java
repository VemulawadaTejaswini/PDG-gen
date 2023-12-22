
import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int V[] = new int[N];
		int C[] = new int[N];
		int mouke[] = new int[N];
		int ans = 0;

		for (int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			ans += Math.max(V[i] - C[i], 0);
		}

		System.out.println(ans);

		sc.close();
	}
};