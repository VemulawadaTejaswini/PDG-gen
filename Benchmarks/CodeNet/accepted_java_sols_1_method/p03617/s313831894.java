import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long q = sc.nextLong();
		long h = sc.nextLong();
		long s = sc.nextLong();
		long d = sc.nextLong();
		long[] price = { q * 4, h * 2, s, d / 2 };
		Arrays.sort(price);
		long n = sc.nextLong();
		long ans = 0;
		for (int i = 0; i < 4&&n!=0; i++) {
			if(price[i]==q*4) {
				ans += q*n*4;
				n -= n;
			}
			else if(price[i]==h*2) {
				ans += h*n*2;
				n -= n;
			}
			else if(price[i]==s) {
				ans += s*n;
				n -= n;
			}
			else if(price[i]==d/2) {
				ans += d*(n/2);
				n-=n/2*2;
			}
		}
		System.out.println(ans);
	}
}