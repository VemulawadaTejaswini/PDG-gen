import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		BigInteger count = new BigInteger("1");
		boolean t = true;
		int n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			if (t = true) {
				long j = kb.nextLong();
				count = count.multiply(BigInteger.valueOf(j));
				if (count.compareTo(new BigInteger("1000000000000000000")) == 1) {
					t = false;
				}
			}
		}
		int res = count.compareTo(new BigInteger("1000000000000000000"));
		if (res == 1) {
			System.out.println(-1);
		} else {
			System.out.println(count);
		}

		kb.close();
	}

}
