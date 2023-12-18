import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long ans = 0;
		long cnt1 = 0;
		long cnt2 = 0;
		long mod = 1000000007;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(a[i] > a[j]) {
					cnt1++;
				}
			}
			for(int j = i + 1; j < n; j++) {
				if(a[i] > a[j]) {
					cnt2++;
				}
			}
		}
//			System.out.println(before);
//			System.out.println(after);
		ans = (((cnt1 % mod) * ((k * (k - 1)) / 2 % mod)) % mod) % mod;
		ans = (ans + (cnt2 * k));
		ans = ans % mod;
		System.out.print(ans);
	}
}
