import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			scanner.nextInt();
			scanner.nextLine();
			Set<Integer> commonSet = new HashSet<>();
			for (int i = 0; i < n; i++) {
				int number = scanner.nextInt();
				Set<Integer> set = new HashSet<>();
				for (int j = 0; j < number; j++) {
					set.add(scanner.nextInt());
				}
				scanner.nextLine();
				if (0 == i) {
					commonSet.addAll(set);
				} else {
					Set<Integer> removeSet = new HashSet<>();
					for (Integer integer : commonSet) {
						if (!set.contains(integer)) {
							removeSet.add(integer);
						}
					}
					commonSet.removeAll(removeSet);
				}
			}
			System.out.println(commonSet.size());
		}
	}
}
