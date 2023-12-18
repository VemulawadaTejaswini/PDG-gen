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


		//-------------------------------------------------------------------------------------

		int tmp = n / 1000;
		ans = (tmp + 1) * 1000 - n;
		if(n % 1000 == 0)
			ans = 0;


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