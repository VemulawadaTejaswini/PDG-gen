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

		Stack<Integer> stack = new Stack<Integer>();
		while(in.hasNext()) {
			int d = in.nextInt();
			if(d == 0) {
				int ans = stack.pop();
				System.out.println(ans);
			} else {
				stack.push(d);
			}
		}
	}
}