import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int l = 0, r = 0, temp = a[0];
		long cout = 0;
		while (l < n) {
			while (r < n - 1) {
				if (temp + a[r + 1] == (temp ^ a[r + 1])) {
					temp += a[r + 1];
					r++;
				} else
					break;
			}
			cout += r + 1 - l;
			temp -= a[l];
			l++;
		}
		System.out.println(cout);
	}
}