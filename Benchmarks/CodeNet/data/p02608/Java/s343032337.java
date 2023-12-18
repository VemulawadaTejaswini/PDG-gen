import java.util.Scanner;
import java.util.TreeMap;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int n = sc.nextInt();
		long a = 0;
		long b = 0;
		long c = 0;
		TreeMap<Long,Long> map = new TreeMap<Long, Long>();

		//-------------------------------------------------------------------------------------

		for(long i = 1; i <= n; i++) {
			map.put(i, (long)0);
		}


		while(true) {
			long calc = 0;
			calc = a * a + b * b + c * c + a * c + a * b + b * c;
//			System.err.println(a + " " + b+ " " + c+ " " + calc);

			if(a == b && a == c) {
				if(a > 0 && b > 0 && c > 0) ans = 1;
			} else {
				if(a > 0 && b > 0 && c > 0) ans = 3;
			}

			if(a == b && a == c) {
				a++;
				b = 1;
				c = 1;
			} else if(a > b) {
				b++;
			} else if(b > c) {
				c++;
			}

			if(calc == 0) {
				continue;
			}


			if(calc <= n) {
				long tmp = ans;
				tmp += map.get(calc);
				map.put(calc, tmp);
			}

			if(a > 400)
				break;

		}

		for(int i = 1; i <= n; i++) {
			System.out.println(map.get((long)i));
		}

		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

//		System.out.println(ans);

		sc.close();
	}



}