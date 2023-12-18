import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		System.out.println(String.format("%.0f",fact(n)));
	}

	public static double fact(int n) {
		double ans = 1;
		for(int i=2;i<=n;i++) {
			ans *= i;
		}
		return ans;
	}
}