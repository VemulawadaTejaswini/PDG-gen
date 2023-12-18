import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N =scan.nextLong();
		long num = 1;

		BigInteger ans = BigInteger.valueOf(1);
		for(long i = 0; i < N; i++ ) {
			long A = scan.nextLong();
			ans = keisan(ans,A);

			if(1000000000000000000L < num) {
				System.out.println("-1");
				scan.close();
				return;
			}
		}
		System.out.println(ans);
		scan.close();

		}
	 static BigInteger keisan(BigInteger num,long num2) {

		    BigInteger result = num;

		      result = result.multiply(BigInteger.valueOf(num2));
		      return result;

		    }

	}