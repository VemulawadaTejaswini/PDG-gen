import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - 1;
		}
		sc.close();

		Set<Integer> set = new HashSet<>();
		set.add(0);
		int i = 0;
		int ans = 0;
		while (true) {
			int j = a[i];
			ans++;
			if (j == 1) {
				System.out.println(ans);
				return;
			}
			if (!set.add(j)) {
				System.out.println(-1);
				return;
			}
			i = j;
		}
	}
}
