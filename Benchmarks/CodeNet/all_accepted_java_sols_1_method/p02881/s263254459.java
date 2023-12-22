import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long ans = n-1;
		
		for(long i = 2 ; i * i <= n ; i++) {
			if(n % i == 0) {
				long p = n /i;
				long q = i;
				ans = Math.min(ans, (long)(p+q -2));
			}
		}
		System.out.println(ans);

	}
	

}
