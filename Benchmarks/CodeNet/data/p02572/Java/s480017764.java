import java.math.BigInteger;

public class Main {
	final private static BigInteger modval = BigInteger.valueOf(1000000000L + 7);

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var N = sc.nextInt();
		var A = new Long[N];
		long sumNow = 0;
		for (var i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			sumNow += A[i];
		}
		BigInteger res = BigInteger.ZERO;
		for (int i = 0; i < N; i++) {
			sumNow -= A[i];
			res = res.add(BigInteger.valueOf(sumNow).multiply(BigInteger.valueOf(A[i])));
			res = res.mod(modval);
		}
		System.out.println(res);

	}
}