import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// 入力
		final int a, b, c;
		try(Scanner scan = new Scanner(System.in)) {
			a = scan.nextInt();	// 2≤A，B，C≤10^9
			b = scan.nextInt();
			c = scan.nextInt();
		}
		
		long result;
		// 偶数の辺があれば、そこで2等分できる。
		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			result = 0;
		} else {
			int[] edges = {a, b, c};
			// 短い辺2つの積 * 1(残りの辺も奇数)
			Arrays.sort(edges);
			result = (long) edges[0] * edges[1];
		}
		
		// 出力
		try (PrintWriter out = new PrintWriter(System.out)) {
			out.println(result);
		}

	}

}