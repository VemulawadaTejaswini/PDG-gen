import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];
		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt();
		}
		if (n >= m) {
			System.out.println(0);
			System.exit(0);
		}
		Arrays.sort(x);
		int[] sa = new int[m - 1];
		for (int i = 0; i < m - 1; i++) {
			sa[i] = x[i + 1] - x[i];
		}
		Arrays.sort(sa);
		long len = x[m - 1] - x[0];
		for (int i = 0; i < n - 1; i++) {
			len -= sa[m - 2 - i];
		}
		System.out.println(len);
	}
}