import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		long ans = N == M ? 2 : 1;
		
		for (long i = 1; i <= N; i++) {
			ans *= i;
			ans %= 1_000_000_007;
		}
		
		for (long i = 1; i <= M; i++) {
			ans *= i;
			ans %= 1_000_000_007;
		}
		
		if (Math.abs(N-M) > 1)
			ans = 0;
		
		System.out.println(ans);
	}

}