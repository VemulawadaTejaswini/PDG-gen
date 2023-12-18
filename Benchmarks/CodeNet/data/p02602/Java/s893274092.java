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
		int k = sc.nextInt();
		Long[] a = new Long[n + 1];
		Long[] ak = new Long[n + 1];
		for (int i = 1; i < n + 1; i++) {
			a[i]= sc.nextLong();
			long tmp = 1;
			for(int j = i; j >= 1 || j > i - k; j--) {
				tmp *= a[i];
			}
			ak[i] = tmp;
		}


		//-------------------------------------------------------------------------------------
		f = true;
		for(int i = k + 1; i <= n; i++) {
			if(ak[i - 1] < ak[i]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

//		System.out.println(ans);

		sc.close();
	}



}