import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var set = new HashSet[n];
		for (int i = 0; i < n; i++) {
			set[i] = new HashSet<Integer>();
		}
		for (int i = 0; i < m; i++) {
			var a = sc.nextInt();
			var b = sc.nextInt();
			set[a - 1].add(b);
			set[b - 1].add(a);
		}
		sc.close();

		var min = new int[n];
		var r = new int[n];
		Arrays.fill(min, Integer.MAX_VALUE);
		min[0] = 0;
		check(set, min, r, 1);

		System.out.println("Yes");
		for (int i = 1; i < n; i++) {
			System.out.println(r[i]);
		}
	}

	public static void check(HashSet[] set, int[] min, int[] r, int n) {
		for (var x : set[n - 1]) {
			if (min[n - 1] + 1 < min[(int) x - 1]) {
				min[(int) x - 1] = min[n - 1] + 1;
				r[(int) x - 1] = n;
				check(set, min, r, (int) x);
			}
		}
	}
}