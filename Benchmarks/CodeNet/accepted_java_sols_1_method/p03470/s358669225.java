import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Integer a[] = new Integer[N];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a,Collections.reverseOrder());

		int cnt = 0;

		for (int i = 0; i < a.length; i++) {

			if(i==0) {
				cnt ++;
			} else if (i != 0 && a[i] != a[i - 1]) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}
