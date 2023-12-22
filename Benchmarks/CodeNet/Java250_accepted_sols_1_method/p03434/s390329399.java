import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];

		int i = 0;
		while(sc.hasNext()) {
			a[i] = sc.nextInt();
			i++;
		}

		Arrays.sort(a, Collections.reverseOrder());

		int Alice = 0;
		int Bob = 0;
		int diff = 0;
		for(int j=0; j<a.length; j++) {
			if (j % 2 == 0) {
				Alice += a[j];
			} else {
				Bob += a[j];
			}
		}
		diff = Alice - Bob;
		System.out.println(diff);
	}
}
