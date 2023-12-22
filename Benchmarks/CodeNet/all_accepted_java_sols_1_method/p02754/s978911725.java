import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

//		int n = sc.nextInt();


		//-------------------------------------------------------------------------------------

		ans = n / (a + b);
		ans *= a;

		if(n % (a + b) > 0) {
			if(n % (a + b) > a) {
				ans += a;
			} else
				ans += n % (a + b);
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