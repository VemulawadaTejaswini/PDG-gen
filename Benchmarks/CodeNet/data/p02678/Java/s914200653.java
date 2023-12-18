import java.util.ArrayList;
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

		var r = new int[n];
		check(set, r, 1);
		System.out.println("Yes");
		for (int i = 1; i < n; i++) {
			System.out.println(r[i]);
		}
	}

	public static void check(HashSet[] set, int[] r, int n) {
		var list = new ArrayList<Integer>();
		for (var x : set[n - 1]) {
			if ((int)x != 1 && r[(int) x - 1] == 0) {
				r[(int) x - 1] = n;
				list.add((int)x);
			}
		}
		for (var x : list) {
			check(set, r, x);
		}
	}
}