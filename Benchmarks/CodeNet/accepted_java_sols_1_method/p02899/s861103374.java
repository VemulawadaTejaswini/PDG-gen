import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nk = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		List<Integer> as = Arrays.asList(scanner.nextLine().split(" ")).stream().map(x -> Integer.parseInt(x))
				.collect(Collectors.toList());

		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < as.size(); i++) {
			m.put(i + 1, as.get(i));
		}

		List<Map.Entry<Integer, Integer>> l = new ArrayList<Map.Entry<Integer, Integer>>(m.entrySet());
		l.sort((a, b) -> a.getValue() - b.getValue());

		for (Map.Entry<Integer, Integer> v : l) {
			System.out.print(v.getKey() + " ");
		}
	}
}