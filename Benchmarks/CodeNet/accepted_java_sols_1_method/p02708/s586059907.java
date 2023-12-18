import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextInt();
		long k = scan.nextInt();
		scan.close();
		
		long ans = 0;
		for(long i = k; i <= n+1; i++) {
			long max = n*(n+1)/2 - (n-i)*(n-i+1)/2;
			long min = i*(i-1)/2;
			ans += max - min + 1;
			ans %= (long)Math.pow(10, 9) + 7;
		}
		
		System.out.println(ans);
	}
}