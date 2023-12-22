import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long r = Long.MAX_VALUE;
		// min(i,j)<=nのルート<=10^6
		for(long i=1; i*i<=n; i++) {
			if(n%i != 0) continue;
			long j = n/i;
			r = Math.min(r, i+j-2);
		}
		System.out.println(r);
	}
}