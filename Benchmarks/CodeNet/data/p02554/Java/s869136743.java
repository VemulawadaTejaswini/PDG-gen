import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long mod = (long)Math.pow(10, 9) + 7;
		long ans = 1;
		long pow = 10;
		
		if(n == 1) {
			System.out.println(0);
		}else {
			for(long i=n;i>1;i--) {
				ans *= i;
				ans %= mod;
			}
			for(long j=n-2;j>1;j--) {
				pow *= 10;
				pow %= mod;
			}
			ans *= pow;
			ans %= mod;
			System.out.println(ans);
		}

	}

}
