import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] v = new int[N];
		for (int i = 0; i < N; ++i) {
			v[i] = sc.nextInt();
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 1; i <= (int) Math.sqrt(v[0]); ++i) {
			if (v[0] % i != 0) continue;
			boolean ok = true;
			for (int j = 1; j < N; ++j) {
				if (v[j] % i != 0) {
					ok = false;
					break;
				}
			}
			if (ok) ans.add(i);
			if (i * i != v[0]) {
				ok = true;
				for (int j = 1; j < N; ++j) {
					if (v[j] % (v[0] / i) != 0) {
						ok = false;
						break;
					}
				}
				if (ok) ans.add(v[0] / i);
			}
		}
		Collections.sort(ans);
		for (int a : ans) {
			System.out.println(a);
		}
	}

}