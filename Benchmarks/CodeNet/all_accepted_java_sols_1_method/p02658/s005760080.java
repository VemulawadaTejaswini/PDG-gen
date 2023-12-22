import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static long mod = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] t = sc.nextLine().split(" ");
		int  n = Integer.parseInt(t[0]);
		//long k = Long.parseLong(t[1]);

		String[] r = sc.nextLine().split(" ");
		BigInteger ans = BigInteger.ONE;
		BigInteger max = BigInteger.ONE;
		for (int i = 0; i < 18; i++) {
			max = max.multiply(BigInteger.valueOf(10));
		}

		for(int i = 0; i < n; i ++) {

			if (BigInteger.ZERO.equals(new BigInteger(r[i]))) {
				ans = BigInteger.ZERO;
				break;
			}
		}

		if(Integer.parseInt(ans.toString()) == 0) {
			System.out.println(ans);
			return;
		}

		for(int i = 0; i < n; i ++) {
			ans = ans.multiply(new BigInteger(r[i]));
			if(ans.compareTo(max) > 0) {

			ans = BigInteger.valueOf(-1);
			break;
			}
		}
		System.out.println(ans);
	}
}
