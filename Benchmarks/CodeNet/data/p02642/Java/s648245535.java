import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		List<Long> a = new ArrayList<>();

		int i = 0;
		while (i < n) {
			a.add(sc.nextLong());
			i++;
		}
		sc.close();

		int count = 0;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				long x = a.get(i);
				long y = a.get(j);
				if (x % y == 0) {
					count++;
					break;
				}
			}
		}
		System.out.println(n - count);
	}
}
