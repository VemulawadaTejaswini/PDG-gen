import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			int x = scanner.nextInt(), m = scanner.nextInt();
			List<Long> list = new ArrayList<>();
			// contains判定用
			Set<Long> set = new HashSet<>();
			long next = x % m;
			list.add(next);
			set.add(next);
			while (list.size() < n) {
				next = next * next % m;
				if (set.contains(next)) {
					break;
				}
				set.add(next);
				list.add(next);
			}
			if (list.size() == n) {
				System.out.println(list.stream().mapToLong(i -> i).sum());
			} else {
				int start = list.indexOf(next);
				long loop = list.stream().skip(start).mapToLong(i -> i).sum();
				long startSum = list.stream().mapToLong(i -> i).limit(start).sum();
				long bai = (n - start) / (list.size() - start);
				long remain = (n - start) % (list.size() - start);
				System.out.println(
						startSum + bai * loop + list.stream().mapToLong(i -> i).skip(start).limit(remain).sum());
			}
		}
	}
}
