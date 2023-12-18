import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();

		if (n < 3) {
			System.out.println(0);
			return;
		}

		Long[] l = new Long[n];

		for (Integer i = 0; i < n; i++) {
			l[i] = sc.nextLong();
		}

		Arrays.sort(l);

		Integer count = 0;

		for (Integer i = 0; i < n - 2; i++) {
			for (Integer j = i + 1; j < n - 1; j++) {
				for (Integer k = j + 1; k < n; k++) {
					if (l[i] == l[j] || l[j] == l[k] || l[k] == l[i]) {
						continue;
					}
					if (l[k] < l[i] + l[j]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}