import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();
//		int n = sc.nextInt();
		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();

		//-------------------------------------------------------------------------------------
		long tmp = Math.abs(a - b);
		for(long i = 0; i < t; i++) {
			tmp -= v;
			tmp += w;
			if(tmp == 0) {
				f = true;
				break;
			}
		}

		//-------------------------------------------------------------------------------------

		if(f) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

//		System.out.println(ans);

		sc.close();
	}



}