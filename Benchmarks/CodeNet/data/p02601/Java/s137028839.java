import java.util.Scanner;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();


		//-------------------------------------------------------------------------------------

		for(int i = 0; i < k; i++) {
			if(c < b) {
				c *= c;
				continue;
			}
			if(b < a) {
				b *= b;
				continue;
			}
		}

		if(c > b && b > a) {
			f = true;
		}

		//-------------------------------------------------------------------------------------

		if(f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

//		System.out.println(ans);

		sc.close();
	}



}