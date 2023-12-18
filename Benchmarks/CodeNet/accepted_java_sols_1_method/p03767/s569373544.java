import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextLong();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N * 3; i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);
//		for (int i = 0; i < N ; i++) {
//			list.add(i * 3 + 2, list.remove(list.size() - 1));
//		}

		long sum = 0;
		for (int i = 0; i < N; i++) {
			sum += list.get(i * 2 + 1);
		}
		System.out.println(sum);
	}
}
