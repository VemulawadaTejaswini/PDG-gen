import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BigInteger> pointlist = new ArrayList<BigInteger>();

		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();

		pointlist.add(BigInteger.ZERO);

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (i == 0) {
				pointlist.add(BigInteger.valueOf(a));
			} else {
				BigInteger bi = pointlist.get(i - 1);
				pointlist.add(bi.multiply(BigInteger.valueOf(a)));
			}
		}

		for (int a = 1; a < pointlist.size() - k; a++) {
			int hugou = pointlist.get(a+k).add(pointlist.get(a - 1).negate()).signum();

			if (hugou == 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}