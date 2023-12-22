import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		final int n;	// 1≦N≦100
		final int[] a;	// −100≦ai≦100
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
		}
		
		// 数値が小さいのでそのまま全列挙計算したほうが速い。
		
		int result = IntStream.rangeClosed(-100, 100)
				.map(y -> Arrays.stream(a).map(e -> (e-y)*(e-y)).sum())
				.min().getAsInt();
		
		// 出力
		out.println(result);
		out.close();
	}

}