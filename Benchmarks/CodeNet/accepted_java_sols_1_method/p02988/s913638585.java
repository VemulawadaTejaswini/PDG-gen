import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		Scanner sysin = new Scanner(System.in);
		final int n = sysin.nextInt();
		int[] p = IntStream.range(0, n)
					.map(i -> sysin.nextInt())
					.boxed()
					.mapToInt(Integer::intValue)
					.toArray();
		sysin.close();

		int answer = 0;
		for (int i = 1; i < p.length - 1; i++) {
			if ((p[i] < p[i - 1] && p[i] > p[i + 1]) || (p[i] > p[i - 1] && p[i] < p[i + 1])) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}
