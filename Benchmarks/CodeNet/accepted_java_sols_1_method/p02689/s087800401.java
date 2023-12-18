import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var h = new int[n];
		var a = new int[m];
		var b = new int[m];
		for (var i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for (var i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();

		var set = new HashSet<Integer>();
		for (var i = 0; i < m; i++) {
			int ai = a[i] - 1;
			int bi = b[i] - 1;
			if (h[ai] > h[bi]) {
				set.add(b[i]);
			} else if (h[ai] < h[bi]) {
				set.add(a[i]);
			} else {
				set.add(a[i]);
				set.add(b[i]);
			}
		}

		System.out.println(n - set.size());
	}
}