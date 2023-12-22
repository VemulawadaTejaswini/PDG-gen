import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;


	public static void main(String[] args) {

		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		long n = sc.nextLong();


		//-------------------------------------------------------------------------------------

		double k = 100;
		double r = 1.01;

		do {
			k = Math.floor(k * r);
			ans++;
		} while(k < n);

		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(f) {
//			System.out.println("OK");
//		} else {
//			System.out.println("NG");
//		}

		System.out.println(ans);

		sc.close();
	}
}