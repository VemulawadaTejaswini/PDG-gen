import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(a);

		int max = a[n - 1], m = max / 2, mSmall = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] < m) {
				mSmall = a[i];
			} else if (a[i] == m) {
				System.out.println(max + " " + m);
				break;
			} else if (max - a[i] > mSmall) {
				System.out.println(max + " " + a[i]);
				break;
			} else {
				System.out.println(max + " " + mSmall);
				break;
			}
		}

	}

}