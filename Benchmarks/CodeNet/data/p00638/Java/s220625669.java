import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			long[] val = new long[N];
			for (int i = 0; i < N; ++i) {
				val[i] = sc.nextInt();
				val[i] += sc.nextLong() << 32;
			}
			Arrays.sort(val);
			long sum = 0;
			boolean fail = false;
			for (int i = 0; i < N; ++i) {
				long w = (val[i] & 0x3FFFFFFF);
				long g = val[i] >> 32;
				sum += w;
				if (sum > g) {
					fail = true;
					break;
				}
			}
			System.out.println(fail ? "No" : "Yes");
		}
	}
}