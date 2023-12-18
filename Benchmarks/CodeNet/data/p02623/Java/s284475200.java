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


		long[] a = new long[n];
		a[0]= sc.nextLong();
		for (int i = 1; i < n; i++) {
			a[i]= sc.nextLong() + a[i-1];
		}

		long[] b = new long[m];
		b[0]= sc.nextLong();
		for (int i = 1; i < m; i++) {
			b[i]= sc.nextLong() + b[i-1];
		}

		//-------------------------------------------------------------------------------------

//		Arrays.sort(a);
//		Arrays.sort(b);

		for(int i =0; i < n; i++ ) {
			int j = m-1;
			if(a[i] > k) {
				continue;
			}
			while(a[i] + b[j] > k) {
				j--;
			}
//			System.err.println(i +" " + j);
			ans = Math.max(ans, i+1+j + 1);
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