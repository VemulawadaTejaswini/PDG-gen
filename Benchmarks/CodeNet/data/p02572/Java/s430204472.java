import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), mod = (int)(1e9+7), ans = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; ++i)
			arr[i] = sc.nextInt();
		int[] sum = new int[n+1];
		sum[n-1] = arr[n-1];

		for(int i = n-2; i >= 1; --i) {
			sum[i] = sum[i+1]+arr[i];
		}
		for(int i = 0; i <= n-2; ++i) {
			ans = (ans%mod + (arr[i]%mod * sum[i+1]%mod)%mod)%mod;
		}
		System.out.println(ans);
	}
}