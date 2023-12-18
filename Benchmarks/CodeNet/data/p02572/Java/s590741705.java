import java.util.Scanner;


public class Main {
	final static long MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextLong();
		}



		//-------------------------------------------------------------------------------------


		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
//				System.err.println(a[i] * a[j]);
				ans += a[i] * a[j];
				ans = ans % MOD;
			}
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