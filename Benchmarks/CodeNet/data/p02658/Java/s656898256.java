import java.math.BigInteger;
import java.util.*;

public class Main {

	static BigInteger MAX = BigInteger.valueOf(1000000000000000000l);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger res = BigInteger.ONE;
		boolean hasZero = false;
		boolean isOver = false;
		for (int i = 0; i < N; i++) {
			long num = sc.nextLong();
			if (num == 0l) {
				hasZero = true;
			}
			res = res.multiply(BigInteger.valueOf(num));
			if (res.compareTo(MAX) > 0) {
				isOver = true;
			}
		}
		if (isOver) {
			if (hasZero) {
				System.out.println("0");
			} else {
				System.out.println("-1");
			}
		} else {
			if (hasZero) {
				System.out.println("0");
			} else {
				System.out.println(res);
			}
		}
		sc.close();
	}
}
