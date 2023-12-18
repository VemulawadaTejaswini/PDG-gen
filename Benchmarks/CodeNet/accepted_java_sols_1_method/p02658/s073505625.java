import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		BigInteger max = BigInteger.valueOf((long)Math.pow(10, 18));

		BigInteger num = BigInteger.valueOf(1);

		List<Long> numList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			numList.add(stdIn.nextLong());
		}

		Collections.sort(numList);
		stdIn.close();

		if(numList.get(0) == 0) {
			System.out.println(0);
			return;
		}

		for (int i = 0; i < n; i++) {
			num = num.multiply(BigInteger.valueOf(numList.get(i)));

			if(num.compareTo(max) > 0) {
				break;
			}
			if(num.signum() == 0) {
				break;
			}
		}

		if(num.compareTo(max) > 0) {
			System.out.println(-1);
		} else {
			System.out.println(num);
		}

	}
}
