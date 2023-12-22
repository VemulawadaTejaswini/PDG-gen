import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if (a[i] == 0) {
				System.out.println(0);
				return;
			}
		}

		long prod = 1;
		for (int i = 0; i < n; i++) {
			if (1000000000000000000l  / prod< a[i]) {
				System.out.println(-1);
				return;
			} else {
				prod *= a[i];
			}
		}

		System.out.println(prod);

		sc.close();
	}

}
