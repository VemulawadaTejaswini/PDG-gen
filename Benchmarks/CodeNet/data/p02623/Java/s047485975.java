import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

	public static long min = 0;
	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();

		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();


		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextLong();
		}

		long[] b = new long[m];
		for (int i = 0; i < m; i++) {
			b[i]= sc.nextLong();
		}

		//-------------------------------------------------------------------------------------

		dfs(a, b, 0, 0, k, 0, 0);


		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}

	public static void dfs(long[] a, long[] b, int i, int j, long k, long sum, int count) {
		if(count > ans) {
			ans = count;
		}

		if(i < a.length) {
			if(sum + a[i] <= k) {
				dfs(a, b, i+1, j, k, sum+a[i], count+1);
			}
		}
		if(j < b.length) {
			if(sum + b[j] <= k) {
				dfs(a, b, i, j+1, k, sum+b[j], count+1);
			}
		}
	}

}