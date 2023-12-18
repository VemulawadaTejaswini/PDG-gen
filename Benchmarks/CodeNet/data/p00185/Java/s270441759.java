
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		boolean[] primes = new boolean[1000001];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= 1000000; i++) {
			if (!primes[i]) {
				list.add(i);
				for (int j = i * 2; j <= 1000000; j += i) {
					primes[j] = true;
				}
			}

		}
		int[] num = new int[1000001];
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j >= 0; j--) {
				if (list.get(i) + list.get(j) <= 1000000) {
					num[list.get(i) + list.get(j)]++;
				}
			}
		}
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			System.out.println(num[n]);
		}

	}
}