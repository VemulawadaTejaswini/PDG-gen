import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		double ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();

//		String s = sc.next();

//		long k = sc.nextLong();

//		int[] a = new int[n];
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}

//		String s = sc.next();

//		int[] ans = new int[n];

//		ArrayList<Integer> list = new ArrayList<>();

		//-------------------------------------------------------------------------------------

//		if(h == m && h == 0) {
//			ans = 0;
//		} else {
			double ak = (30 *  h) + (0.5 * m);
			double bk = 6 * m;
			double kakudo = Math.abs(ak - bk);
			System.err.println(kakudo);
			ak = a * a;
			bk = b * b;
			double tmp = 2 * a * b * Math.cos(Math.toRadians(kakudo));
			ans = ak + bk - tmp;
			System.err.println(tmp);
			ans = Math.sqrt(ans);
//		}

		//-------------------------------------------------------------------------------------

//		if(!f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}



}