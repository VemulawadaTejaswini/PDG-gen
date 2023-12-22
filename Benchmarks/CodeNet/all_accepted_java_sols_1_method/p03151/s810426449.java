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
		Arrays.setAll(D, i-> A[i] - B[i]);
	}
	public static void main(String[] args) {
		long[] remains = Arrays.stream(D).filter(i -> i > 0).sorted().toArray();
		long[] shortages = Arrays.stream(D).filter(i -> i < 0).toArray();
		long shortage = Arrays.stream(shortages).sum();
		int ans = shortages.length;
		for (int j = remains.length - 1; j > -1; j--) {
			if (shortage >= 0) {
				break;
			}
			shortage += remains[j];
			ans++;
		}
		if (shortage < 0) {
			ans = -1;
		}
		System.out.println(ans);
	}
}