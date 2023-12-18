import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int cnt = 0;
		for (int i = 1; i < n ; i++) {
			List<String> l = new ArrayList<>();
			String a = s.substring(0,i);
			String b = s.substring(i);
			int c = 0;
			if (i < n / 2) {
				for (int k = 0 ; k < a.length() ; k++) {
					String t = a.substring(k, k+1);
					if (b.contains(t) && !l.contains(t)) {
						c++;
						l.add(t);
					}
				}
			} else {
				for (int k = 0 ; k < b.length() ; k++) {
					String t = b.substring(k, k+1);
					if (a.contains(t) && !l.contains(t)) {
						c++;
						l.add(t);
					}
				}
			}
			if (cnt < c) {
				cnt = c;
			}
		}
		System.out.println(cnt);
	}
}
