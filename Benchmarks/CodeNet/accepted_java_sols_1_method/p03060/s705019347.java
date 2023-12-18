import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		for (int i = 0; i < n; ++i)
			v[i] = sc.nextInt();
		for (int i = 0; i < n; ++i) {
			int c = sc.nextInt();
			v[i] -= c;
		}
		sc.close();
		Arrays.sort(v);
		int ans = 0;
		for (int i = n - 1; i >= 0; --i) {
			if (v[i] > 0)
				ans += v[i];
		}
		System.out.println(ans);
	}
}
