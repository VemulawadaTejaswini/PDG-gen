import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), ansA = 0, ansB = 0;
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a, Comparator.reverseOrder());

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				ansA += a[i];
			} else {
				ansB += a[i];
			}
		}
		System.out.println(ansA-ansB);
	}

}