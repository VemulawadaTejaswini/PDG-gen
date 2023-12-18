import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] H = new long[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		boolean[] ret = new boolean[N];
		Arrays.fill(ret, true);
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(H[b - 1] == H[a - 1]) {
				ret[a - 1] = false;
				ret[b - 1] = false;
			} else if(H[b - 1] > H[a - 1]) {
				ret[a - 1] = false;
			} else {
				ret[b - 1] = false;
			}
		}
		sc.close();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(ret[i]) ans++;
		}
		System.out.println(ans);
	}
}
