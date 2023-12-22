import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] w = new String[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.next();
		}
		char last = w[0].charAt(0);
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(w[i])) {
				System.out.println("No");
				return;
			} else {
				map.put(w[i], 1);
			}
			if (w[i].charAt(0) != last) {
				System.out.println("No");
				return;
			} else {
				last = w[i].charAt(w[i].length()-1);
			}
		}
		System.out.println("Yes");
	}
}
