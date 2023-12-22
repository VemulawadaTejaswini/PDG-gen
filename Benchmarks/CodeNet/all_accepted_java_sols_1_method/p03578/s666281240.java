import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<Integer, Integer> d = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (d.containsKey(temp)) {
				int cnt = d.get(temp);
				d.remove(temp);
				d.put(temp, cnt + 1);
			} else {
				d.put(temp, 1);
			}
		}

		int m = sc.nextInt();
		Map<Integer, Integer> t = new HashMap<>();
		for (int i = 0; i < m; i++) {
			int temp = sc.nextInt();
			if (t.containsKey(temp)) {
				int cnt = t.get(temp);
				t.remove(temp);
				t.put(temp, cnt + 1);
			} else {
				t.put(temp, 1);
			}
		}

		boolean ans = true;
		for (int key : t.keySet()) {
			if (d.containsKey(key)) {
				if (d.get(key) >= t.get(key)) {
				} else {
					ans = false;
				}
			} else {
				ans = false;
			}
		}

		if	(ans) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}

	}

}

