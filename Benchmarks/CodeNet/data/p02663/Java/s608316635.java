import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();

//		String s = sc.next();

//		int[] ans = new int[n];

		//-------------------------------------------------------------------------------------

		while(!f) {
			if(h1 == h2 && m1 == m2) {
				f = true;
			}

			m1++;
			ans++;
			if(m1 >= 60) {
				h1++;
				m1 = 0;
			}
			if(h1 >= 24) {
				h1 = 0;
			}
		}

		ans -= (k + 1);

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