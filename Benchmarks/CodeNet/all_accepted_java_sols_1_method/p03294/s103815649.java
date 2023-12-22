import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger A[] = new BigInteger[N];
		BigInteger m = A[0] = new BigInteger(sc.next());
		BigInteger gcd;

		for (int i = 1; i < N; i++) {
			A[i] = new BigInteger(sc.next());
			gcd = A[i].gcd(m);
			m = A[i].multiply(m).divide(gcd);
		}

		m = m.subtract(BigInteger.ONE);

		BigInteger fMax = BigInteger.ZERO;

		for (int i = 0; i < N; i++) {
			fMax = fMax.add(m.remainder(A[i]));
		}

		System.out.println(fMax);

		return;
	}
}
