import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static long[] A = new long[N];
	static long[] B = new long[N];
	static long[] D = new long[N];
	static {
		Arrays.setAll(A, i -> sc.nextLong());
		Arrays.setAll(B, i -> sc.nextLong());
		Arrays.setAll(D, i -> A[i] - B[i]);
	}
	public static void main(String[] args) {
		long[] shortages = Arrays.stream(D).filter(i -> i < 0).toArray();
		long shortage = Arrays.stream(shortages).sum();
		// B-A > 0なテストは絶対に変えなければならない
		int ans = shortages.length;
		long[] remains = Arrays.stream(D).filter(i -> i > 0).sorted().toArray();
		for (int i = remains.length - 1; i >= 0; i--) {
			// 不足分が補われたら抜ける
			if (shortage >= 0) break;
			shortage += remains[i];
			ans++;
		}
		// 余剰分を充当してなお不足分が補われていなかったら -1
		if (shortage < 0) {
			ans = -1;
		}
		System.out.println(ans);
	}
}