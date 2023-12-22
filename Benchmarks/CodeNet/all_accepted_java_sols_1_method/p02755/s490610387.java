import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		long a = sc.nextLong();
		long b = sc.nextLong();

//		int n = sc.nextInt();


		//-------------------------------------------------------------------------------------

		ans = -1;
		for(int i = 0; i < 20000; i++) {
			double tmpa = Math.floor(i * 0.08);
			double tmpb = Math.floor(i * 0.1);
			if(tmpa == a && tmpb == b) {
				ans = i;
				break;
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