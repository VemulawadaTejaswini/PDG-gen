import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextInt();
		long mod = 1000000007;
		long all = 1;
		long rmEight = 1;
		long rmNine = 1;
		long rmEightNine = 1;
		
		for(long i = 0; i < N ; i ++) {
			all = (all * 10) % mod;
			rmEight = (rmEight * 9) % mod;
			rmNine = (rmNine * 9) % mod;
			rmEightNine = (rmEightNine * 8) % mod;
		}
		
		long ans = all;
		ans -= rmNine;
		if(ans < 0) {
			ans += mod;
		}
		ans -= rmEight;
		if(ans < 0) {
			ans += mod;
		}
		ans += rmEightNine;
		System.out.println(ans % mod);
	}
}