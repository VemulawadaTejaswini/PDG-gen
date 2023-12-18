import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long mod = 1000000007;
		long ans = 1;
		
		if(n == 1) {
			System.out.println(0);
		}else {
			for(long i=n;i>1;i--) {
				ans *= i;
				ans %= mod;
			}
			System.out.println(ans);
		}

	}

}
