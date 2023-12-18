import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static long[] A = new long[N];
	static long[] B = new long[N];
	static long[] D = new long[N];
	static {
		Arrays.setAll(A, i->sc.nextLong());
		Arrays.setAll(B, i->sc.nextLong());
	}
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			D[i] = A[i] - B[i];
		}
		if (Arrays.stream(D).sum() < 0) {
			System.out.println(-1);
			return;
		}
		if (Arrays.stream(D).allMatch(i-> i >= 0)) {
			System.out.println(0);
			return;
		}
		long ans = Arrays.stream(D).filter(i-> i < 0).count();
		long shortage = Arrays.stream(D).filter(i-> i < 0).sum();
		long[] remains = Arrays.stream(D).filter(i-> i > 0).sorted().toArray();
//		System.out.println(Arrays.toString(remains));
		for (int i = remains.length - 1; i >= 0; i--) {
			shortage += remains[i];
			ans++;
			if (shortage >=0 ) {
				break;
			}
		}
		System.out.println(ans);
	}
}