import java.util.Scanner;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextInt();
		}

		//-------------------------------------------------------------------------------------

		for(int i = 1; i < n; i += 2) {

			if(a[i] % 2 != 0)
				ans++;


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