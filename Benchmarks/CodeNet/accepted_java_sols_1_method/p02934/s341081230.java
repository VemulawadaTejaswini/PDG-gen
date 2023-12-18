import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int N = scn.nextInt();
			//final int[] A = IntStream.generate(scn::nextInt).limit(N).toArray();

			System.out.println(1 /
					IntStream.generate(scn::nextInt).limit(N)
							.mapToDouble(d -> 1.0 / d)
							.reduce((a, b) -> a + b)
							.getAsDouble());
		}
	}
}
