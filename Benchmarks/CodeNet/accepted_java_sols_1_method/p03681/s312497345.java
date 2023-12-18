import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long min = Math.min(N, M);
		long max = Math.max(N, M);
		long sum = 1;
		for(long i = 2; i <= min; i++) {
			sum = sum * i % 1000000007;
		}
		
		if(N == M) {
			System.out.println(((sum * sum) % 1000000007) * 2 % 1000000007);
		} else if(Math.abs(N - M) == 1) {
			System.out.println(sum * ((sum * max) % 1000000007) % 1000000007);
		} else {
			System.out.println(0);
		}
	}
}
