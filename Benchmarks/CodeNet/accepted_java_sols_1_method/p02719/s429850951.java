import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final long N = in.nextLong();
		final long K = in.nextLong();
		if(N < K) System.out.println(Math.min(N, K - N));
		else {
			long mod = N % K;
			System.out.println((mod == 0) ? 0 : (Math.min(mod, Math.abs(K - mod))));
		}
	}
}