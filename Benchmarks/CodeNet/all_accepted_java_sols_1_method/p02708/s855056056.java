import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long prime = (long)(1e9+7);
		long N = sc.nextLong() + 1;
		long K = sc.nextLong();
		long sum = 0;
		for(long i = K; i <= N; i++) {
			long L = ((i-1)*i)/2;
			long R = (i*(2*(N - i)+(i - 1)))/2;
			sum += (R - L + 1) % prime;
		}
		System.out.println(sum % prime);
	}
}