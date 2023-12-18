import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		//ArrayListだとTLE
		int[] a = new int[n];

		if (n % 2 == 0) {
			int l = n / 2 - 1;
			int r = n / 2;
			for (int i = 0; i < n / 2; i++) {
				a[r] = Integer.parseInt(sc.next());
				a[l] = Integer.parseInt(sc.next());
				r++;
				l--;
			}
		} else {
			int l = n / 2 - 1;
			int r = n / 2 + 1;
			a[n / 2] = Integer.parseInt(sc.next());
			for (int i = 0; i < n / 2; i++) {
				a[r] = Integer.parseInt(sc.next());
				a[l] = Integer.parseInt(sc.next());
				r++;
				l--;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n - 1) {
				System.out.print(" ");
			}
		}
		sc.close();

	}

}