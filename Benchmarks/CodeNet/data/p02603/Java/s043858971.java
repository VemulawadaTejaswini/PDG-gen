import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int x = 1000;
		int c = 0;
		BigInteger X = new BigInteger("1000");
		BigInteger C = BigInteger.ZERO;
		for (int i = 0; i < N - 1; i++) {
			if (A[i] < A[i + 1]) {
				C = X.divide(new BigInteger(Integer.toString(A[i])));
				X = X.subtract(C.multiply(new BigInteger(Integer.toString(A[i]))));
			} else if (A[i] > A[i + 1]) {
				X = X.add(C.multiply(new BigInteger(Integer.toString(A[i]))));
				C = BigInteger.ZERO;
			}
		}
		if (C.compareTo(BigInteger.ZERO) == 1) {
			X = X.add(C.multiply(new BigInteger(Integer.toString(A[N - 1]))));
			C = BigInteger.ZERO;
		}
		System.out.println(X);
	}

}