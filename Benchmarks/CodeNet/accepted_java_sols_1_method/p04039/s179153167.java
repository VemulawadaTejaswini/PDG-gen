import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		final String n;		// 1≦N<10000
		final int k;	// 1≦K<10
		final String[] d;	// 0≦D1<D2<…<DK≦9  {D1,D2,…,DK}≠{1,2,3,4,5,6,7,8,9}
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.next();				// 繰り上がり用に先頭に0を挿入。
			k = scan.nextInt();
			d = new String[k];
			for (int i = 0; i < k; i++) {
				d[i] = scan.next();
			}
		}
		
		// n < 10000 より総当り
		int result = IntStream.range(Integer.parseInt(n), 99999)
		.filter(i -> Arrays.stream(d).noneMatch(s -> String.valueOf(i).indexOf(s) != -1))
		.findFirst().getAsInt();

		// 出力
		out.println(result);
		out.flush();
	}
}