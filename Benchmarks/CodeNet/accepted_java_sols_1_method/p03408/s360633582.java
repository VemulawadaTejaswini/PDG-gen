import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> dic = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (dic.get(s) == null) {
				dic.put(s, 1);
			} else {
				dic.put(s, dic.get(s) + 1);
			}
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			if (dic.get(s) != null) {
				dic.put(s, dic.get(s) - 1);
				if (dic.get(s) == 0) {
					dic.remove(s);
				}
			}
		}
		int ans = 0;
		for (String k: dic.keySet()) {
			ans = Math.max(ans, dic.get(k));
		}
		System.out.println(ans);
	}
}
