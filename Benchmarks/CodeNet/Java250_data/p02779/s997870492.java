import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		String ans[] = { "YES", "NO" };
		int an = 0;
		Arrays.sort(a);
		int t = a[0];
		for (int i = 1; i < n; ++i) {
			if (t == a[i]) {
				an = 1;
				break;
			}
			t = a[i];
		}
		System.out.println(ans[an]);
	}
}
