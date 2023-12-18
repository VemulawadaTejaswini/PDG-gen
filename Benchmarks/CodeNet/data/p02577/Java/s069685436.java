import java.util.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger();
		BigInteger NINE = BigInteger.valueOf(9);
		BigInteger R = Sum(N).remainder(NINE);

		if(R.equals(0)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static BigInteger Sum(BigInteger N) {
		BigInteger sum = BigInteger.ZERO;
		// BigInteger remainder(BigInteger val)
		
		while(N != BigInteger.ZERO) {
			BigInteger M = N.remainder(BigInteger.TEN);
			sum = sum.add(M);
			N = N.divide(BigInteger.TEN);
		}
		return sum;
	}
}