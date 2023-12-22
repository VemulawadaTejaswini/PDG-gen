
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		boolean[] primes = new boolean[10000];
		NavigableSet<Integer> navigableSet = new TreeSet<Integer>();
		for (int i = 2; i < 10000; i++) {
			if (!primes[i]) {
				for (int j = i * i; j < 10000; j += i) {
					primes[j] = true;
				}
				if (!primes[i - 2]) {
					navigableSet.add(i);
				}
			}

		}
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int num = scanner.nextInt();
			if (num == 0)
				break;
			int ans = navigableSet.floor(num);
			System.out.println(ans- 2 + " " + ans);
		}
	}
}