import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), i = 0, j = 0;
		long bookCount = 0, a[] = new long[n], b[] = new long[m];
		for (int l = 0; l < n; l++)
			a[l] = sc.nextInt();
		for (int l = 0; l < m; l++)
			b[l] = sc.nextInt();
		while (i < n && j < m) {
			if (a[i] > k && b[j] > k)
				break;
			if (a[i] > b[j] && k >= b[j])
				k -= b[j++];
			else
				k -= a[i++];
			++bookCount;
		}
		while (i < n && a[i] <= k) {
			k -= a[i++];
			++bookCount;
		}
		while (j < m && b[j] <= k) {
			k -= b[j++];
			++bookCount;
		}
		System.out.println(bookCount);
		sc.close();
	}
}
