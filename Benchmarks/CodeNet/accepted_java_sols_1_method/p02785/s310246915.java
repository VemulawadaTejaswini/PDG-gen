import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		List<Integer> list = IntStream.range(0, n).map(i -> scan.nextInt()).boxed().collect(Collectors.toList());
		Collections.sort(list);
		Collections.reverse(list);

		long sum = 0;
		for (int i = k; i < list.size(); i++) {
			sum += list.get(i);
		}

		System.out.println(sum);
		scan.close();
	}
}