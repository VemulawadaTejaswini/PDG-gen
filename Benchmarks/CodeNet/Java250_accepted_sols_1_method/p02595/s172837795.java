import java.util.Scanner;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		double d = sc.nextDouble();

		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextLong();
			b[i]= sc.nextLong();
		}


		//-------------------------------------------------------------------------------------

		for(int i = 0; i < n; i++) {
			long tmpa = (a[i] * a[i]);
			long tmpb = (b[i] * b[i]);
			long tmp = tmpa + tmpb;
			double calc = Math.sqrt(tmp);
			System.err.println(tmpb);
			if(d * d >= tmp) {
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