import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int x = s.nextInt();
		char[] road = new char[n];
		int countFromStart = 0;
		int countToEnd = 0;
		int countC = 0;

		Arrays.fill(road, 'a');
		road[x] = 'x';

		for (int i = 0; i < m; i++) {
			int tmp = s.nextInt();
			road[tmp] = 'c';
		}
		for (int j = 0; j < x; j++) {
			if (road[j] == 'c') {
				++countFromStart;
			}
		}
		for (int k = x + 1; k < n; k++) {
			if (road[k] == 'c') {
				++countToEnd;
			}
		}

		if (countToEnd > countFromStart) {
			for (int p = 0; p < x; p++) {
				if (road[p] == 'c')
					++countC;
			}
		} else {
			for (int q = x + 1; q <n; q++) {
				if (road[q] == 'c') {
					++countC;
				}
			}
		}
		System.out.println(countC);
	}
}
