import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static long min = 2000000000;
	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();

		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();


		long[] a = new long[n+1];
		a[0] = 0;
		for (int i = 1; i <= n; i++) {
			a[i]= sc.nextLong() + a[i-1];
		}

		long[] b = new long[m+1];
		b[0] = 0;
		for (int i = 1; i <= m; i++) {
			b[i]= sc.nextLong() + b[i-1];
		}

		//-------------------------------------------------------------------------------------

//		Arrays.sort(a);
//		Arrays.sort(b);
		int j = m;
		for(int i =0; i < n; i++ ) {
			if(a[i] > k) {
				break;
			}
			while(b[j] > k - a[i]) {
				j--;
			}
//			System.err.println(i +" " + j);
			ans = Math.max(ans, i+j);
		}

		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}
}