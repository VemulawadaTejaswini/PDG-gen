import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0, cnt = 0;
		HashMap<String, Integer> a = new HashMap<String, Integer>();

		for (int i = 0; i < n - 1; i++) {
			cnt = 0;
			a.clear();
			for (int j = 0; j < i; j++) {
				if (s.substring(i).contains(s.substring(j, j + 1))) {
					if (a.get(s.substring(j, j + 1)) == null) {
						a.put(s.substring(j, j +1), 1);
					}
				}
			}
			cnt = a.size();
			if (ans < cnt) {
				ans = cnt;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
