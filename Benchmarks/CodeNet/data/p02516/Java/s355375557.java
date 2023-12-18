import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			int Q = sc.nextInt();
			if (R == 0) return;
			int[] A = new int[Q];
			int[] B = new int[Q];
			int[] O = new int[Q];
			for (int i = 0; i < Q; ++i) {
				A[i] = Integer.parseInt(sc.next());
				B[i] = Integer.parseInt(sc.next());
				O[i] = Integer.parseInt(sc.next());
			}
			boolean[] endR = new boolean[R];
			boolean[] endC = new boolean[R];
			int restR = R;
			int restC = C;
			int ans = 0;
			for (int i = Q - 1; i >= 0; --i) {
				if (A[i] == 0) {
					if (endR[B[i]]) continue;
					endR[B[i]] = true;
					if (O[i] == 1) ans += restC;
					restR--;
				} else {
					if (endC[B[i]]) continue;
					endC[B[i]] = true;
					if (O[i] == 1) ans += restR;
					restC--;
				}
			}
			System.out.println(ans);
		}
	}
}