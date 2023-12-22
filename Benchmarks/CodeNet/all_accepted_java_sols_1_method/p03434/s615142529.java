import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] a = new Integer[n];
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		Arrays.sort(a, Comparator.reverseOrder());
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				alice += a[i];
			} else {
				bob += a[i];
			}
		}
		System.out.println(alice - bob);

	}
}