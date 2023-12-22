import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < N; i++) {
			mp.put(i, K);
		}

		for (int i = 0; i < Q; i++) {
			int A = sc.nextInt() - 1;
			mp.put(A, mp.get(A) + 1);
		}
		sc.close();

		for (int i = 0; i < N; i++) {
			int hp = mp.get(i);
			if (hp - Q > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
