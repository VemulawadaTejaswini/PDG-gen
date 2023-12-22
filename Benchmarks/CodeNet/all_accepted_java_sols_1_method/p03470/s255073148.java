import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Integer[] d = new Integer[n];
		int count = 1;

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		Arrays.sort(d, Collections.reverseOrder());

		for (int i = 1; i < n; i++) {
			if (d[i] >= d[i - 1]) {
				continue;
			}
			count++;
		}

		System.out.println(count);
	}

}
