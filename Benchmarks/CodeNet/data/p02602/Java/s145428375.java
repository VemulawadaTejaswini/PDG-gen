import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long before = 1;
		for (int i = 0; i < k; i++) {
			before *= a[i];
		}

		long after;
		for (int i = k; i < n; i ++) {
			after = before / a[i - k] * a[i];
			if (before < after) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			before = after;
		}



		sc.close();
	}

}
