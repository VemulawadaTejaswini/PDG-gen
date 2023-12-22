import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			Set<Character> set1 = new HashSet<>();
			for (int j = 0; j < i; j++) {
				set1.add(s.charAt(j));
			}
			Set<Character> set2 = new HashSet<>();
			for (int j = i; j < n; j++) {
				set2.add(s.charAt(j));
			}
			int cnt = 0;
			for (Character c : set1) {
				if (set2.contains(c)) {
					cnt++;
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
}
