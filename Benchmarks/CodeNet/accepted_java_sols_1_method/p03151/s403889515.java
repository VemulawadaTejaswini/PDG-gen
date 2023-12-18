import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		int[] sa = new int[n];
		for (int i = 0; i < n; i++) {
			sa[i] = a[i] - b[i];
		}
		Arrays.sort(sa);
		int dif = 0;
		long fusoku = 0;
		boolean bre1 = false;
		for (int i = 0; i < n; i++) {
			if (sa[i] >= 0) {
				bre1 = true;
				break;
			}
			dif++;
			fusoku += sa[i];
		}
		if (!bre1) {
			System.out.println(-1);
		} else {
			boolean bre2 = false;
			for (int i = n - 1; i >= 0; i--) {
				if (fusoku >= 0) {
					bre2 = true;
					break;
				}
				fusoku += sa[i];
				dif++;
			}
			if (!bre2) {
				System.out.println(-1);
			} else {
				System.out.println(dif);
			}
		}
	}
}