import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			Integer a[] = new Integer[n];
			Integer b[] = new Integer[n];
			
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				b[i] = a[i];

			}
			
			Arrays.sort(b, Collections.reverseOrder());
			int max = b[0];
			int sec = b[1];
			
			for (int i = 0; i < n; i++) {
				if (a[i] == max) {
					System.out.println(sec);
				} else {
					System.out.println(max);
				}

			}

		}

	}

}