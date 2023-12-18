import java.util.Scanner;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		int d = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextInt();
			b[i]= sc.nextInt();
		}


		//-------------------------------------------------------------------------------------

		for(int i = 0; i < n; i++) {
			double calc = Math.sqrt((a[i] * a[i]) + (b[i] * b[i]));
//			System.err.println(calc);
			if(d >= calc) {
				ans++;
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