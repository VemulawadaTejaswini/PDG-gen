import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Long> hs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			hs.add(sc.nextLong());
		}
		Collections.sort(hs, Collections.reverseOrder());
		System.out.println(hs.stream().sorted(Collections.reverseOrder()).skip(k).mapToLong(Long::valueOf).sum());
		sc.close();
	}
}
