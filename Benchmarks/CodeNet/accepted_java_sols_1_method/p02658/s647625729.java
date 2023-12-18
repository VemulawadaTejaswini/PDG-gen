import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
// A - Multiplication 1
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long N= sc.nextInt(); //

		//long ans = sc.nextLong();
		BigInteger ans = BigInteger.valueOf(0);
		long x = 0;
		BigInteger v = BigInteger.valueOf(Long.valueOf("1000000000000000000"));

		boolean exFlg = false;

		ArrayList<Long> lstA;
		lstA = new ArrayList<Long>();

		for (int i=0; i < N; i++) {
			x = sc.nextLong();
			// 0掛けしていれば終わり
			if (x == 0) {
				exFlg = true;
				break;
			}
			lstA.add(x);
		}

		if (!exFlg) {
			ans = BigInteger.valueOf(lstA.get(0));
			for (int i=1; i < N; i++) {

				ans= ans.multiply(BigInteger.valueOf(lstA.get(i)));

				try {
					if (ans.subtract(v).longValueExact() > 0) {
						ans = BigInteger.valueOf(-1);
						break;
					}

				} catch (Exception e) {
					ans = BigInteger.valueOf(-1);
					break;
				}

			}

		}
		System.out.println(ans);
	}
}