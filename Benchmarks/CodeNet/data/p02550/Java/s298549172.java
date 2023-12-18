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
			while (true) {
				next = next * next % m;
				if (set.contains(next)) {
					break;
				}
				set.add(next);
				list.add(next);
				if (list.size() >= n) {
					break;
				}
			}
			if (list.size() >= n) {
				System.out.println(list.stream().mapToLong(i -> i).sum());
			} else {
				int start = list.indexOf(next);
				long loop = list.stream().skip(start).mapToLong(i -> i).sum();
				long sum = list.stream().mapToLong(i -> i).sum();
				long bai = (n - list.size()) / (list.size() - start);
				long remain = (n - list.size()) % (list.size() - start);
				System.out.println(sum + bai * loop + list.stream().mapToLong(i -> i).skip(start).limit(remain).sum());
			}
		}
	}
}
