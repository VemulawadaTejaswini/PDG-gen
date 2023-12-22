import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		List<Integer> start = new ArrayList<>();
		List<Integer> end = new ArrayList<>();
		int now = 0;
		for (int i = 0; i < n; i++) {
			if (now != 1 && s.charAt(i) == '1') {
				start.add(i);
				now = 1;
			} else if (now == 1 && s.charAt(i) == '0') {
				end.add(i);
				now = 0;
			}
		}
		if (now == 1) {
			end.add(n);
		}
		if (start.size() < k
				|| (start.size() == k && (s.charAt(0) == '1' || s.charAt(n - 1) == '1'))
				|| (start.size() == k + 1 && s.charAt(0) == '1' && s.charAt(n - 1) == '1')) {
			System.out.println(n);
		} else {
			int max = 0;
			for (int i = 0; i + k < start.size(); i++) {
				max = Math.max(end.get(i + k) - start.get(i), max);
			}
			max = Math.max(end.get(k - 1), max);
			max = Math.max(n - start.get(start.size() - k), max);
			System.out.println(max);
		}
	}
}