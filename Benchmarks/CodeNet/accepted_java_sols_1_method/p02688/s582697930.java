import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int k = stdIn.nextInt();

		Set<Integer> hasOkashiSet = new HashSet<>();

		for (int i = 0; i < k; i++) {
			int d = stdIn.nextInt();
			IntStream.range(0, d).forEach(j -> hasOkashiSet.add(stdIn.nextInt()));

		}

		System.out.println(n - hasOkashiSet.size());

		stdIn.close();
	}
}
