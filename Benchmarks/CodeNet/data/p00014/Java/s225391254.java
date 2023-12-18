import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.StrictMath.sqrt;

/**
 * Wrong Answer
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			int d = in.nextInt();

			int ans = 0;
			for(int i = d; i < 600; i+=d) {
				ans += d * f(i);
			}
			System.out.println(ans);
		}
	}

	public static double f(int x) {
		return x*x;
	}
}