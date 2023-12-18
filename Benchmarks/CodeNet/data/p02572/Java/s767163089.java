import java.util.*;
class Main {
	static int mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long pre[] = new long[n];
		pre[0] = arr[0];
		for (int i = 1; i < n; i++) {
			pre[i] = arr[i] + pre[i-1];
		}
		long ans = 0;
		for (int i = 0; i < n - 1; i++) {
			ans = (ans + (pre[i+1]- pre[i]) * arr[i]) % mod;
		}
		System.out.println(ans);
	}

}