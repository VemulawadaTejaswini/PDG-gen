import java.util.Arrays;
import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);


		//-------------------------------------------------------------------------------------
		int tmp = 0;
		ans += a[n - 1];
		for(int i = n - 2; i > tmp; i--) {
			ans += a[i];
			tmp++;
			if(i > tmp) {
				ans += a[i];
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