import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		Scanner sysin = new Scanner(System.in);
		final int n = sysin.nextInt();
		int[] d = IntStream.range(0, n)
					.map(i -> sysin.nextInt())
					.boxed()
					.sorted(Comparator.naturalOrder())
					.mapToInt(Integer::intValue)
					.toArray();
		sysin.close();

		int low = d[d.length / 2 - 1];
		int high = d[d.length / 2];

		System.out.println(high - low);
	}
}
