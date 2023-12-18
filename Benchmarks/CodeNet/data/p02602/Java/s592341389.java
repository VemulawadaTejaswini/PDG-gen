import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> pointlist = new LinkedList<Integer>();
		List<BigInteger> hyotenlist = new LinkedList<BigInteger>();

		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			pointlist.add(a);
		}

		for (int j = 0; j < n - k + 1; j++) {
			BigInteger product = BigInteger.ONE;

			for (int l = 0; l < k; l++) {
				product = product.multiply(BigInteger.valueOf(pointlist.get(j+l)));
			}

			hyotenlist.add(product);
		}


		for (int a = 0; a < hyotenlist.size() - 1; a++) {
			if (hyotenlist.get(a + 1).compareTo(hyotenlist.get(a)) == 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}