import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] h = new long[100010];
		IntStream.range(0, N).forEach((i) -> h[i] = in.nextLong()); 
		long[] dp = new long[100010];
		IntStream.range(0, 100010).forEach((i) -> dp[i] = Long.MAX_VALUE);
		
		dp[0] = 0;
		
		for (int i = 1; i < N; ++i) {
			long cal1 = dp[i - 1] + Math.abs(h[i] - h[i -1]);
			long cal2 = (i > 1) ? dp[i - 2] + Math.abs(h[i] - h[i - 2]) : Long.MAX_VALUE;
			dp[i] = (cal1 < cal2) ? cal1 : cal2;
		}
		System.out.println(dp[N-1]);
	}

}
