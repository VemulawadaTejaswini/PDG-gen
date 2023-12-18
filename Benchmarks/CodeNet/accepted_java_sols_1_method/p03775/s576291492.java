import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = Integer.MAX_VALUE;
		for(int i = 1; i <= Math.sqrt(N); i++) {
			if(N % i == 0) {
				long temp = Math.max(i, N / i);
				ans = Math.min(temp, ans);
			}
		}
		System.out.println(Long.toString(ans).length());
	}
}
