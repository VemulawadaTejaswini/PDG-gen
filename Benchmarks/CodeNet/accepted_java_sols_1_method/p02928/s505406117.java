import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static long k = 0;
	static int[] a = null;
	static int[] inner = null;
	static int[] outer = null;
	static long innerSum = 0;
	static long outerSum = 0;
	static long ans = 0;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		k = sc.nextLong();
		a = new int[n];
		for(int i = 0; i < n; ++i) a[i] = sc.nextInt();
		
		inner = new int[n];
		for(int i = 0; i < n - 1; ++i) {
			for(int j = i + 1; j < n; ++j) {
				inner[i] += (a[i] > a[j]) ? 1 : 0;
			}
		}
		
		outer = new int[n];
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				outer[i] += (a[i] > a[j]) ? 1 : 0;
			}
		}
		
		for(int i = 0; i < n; ++i) {
			innerSum += inner[i];
			innerSum %= MOD;
		}
		innerSum = innerSum * k % MOD;
		
		for(int i = 0; i < n; ++i) {
			outerSum += outer[i];
			outerSum %= MOD;
		}
		outerSum = k * (k - 1) / 2 % MOD * outerSum % MOD;
		ans = (innerSum + outerSum) % MOD;
		System.out.println(ans);
	}
}