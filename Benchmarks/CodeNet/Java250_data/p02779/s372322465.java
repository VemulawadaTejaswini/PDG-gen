import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			a[i] = input;
		}

		Arrays.sort(a);

		for (int i = 0; i < n; i++) {
			if (i != n - 1 && (a[i] == a[i + 1])) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}
