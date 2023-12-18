import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer N = Integer.parseInt(scanner.next());
		Integer K = Integer.parseInt(scanner.next());

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < K; i++) {
			Integer d = Integer.parseInt(scanner.next());
			for (int j = 0; j < d; j++) {
				set.add(Integer.parseInt(scanner.next()));
			}
		}

		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if (!set.contains(i)) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
