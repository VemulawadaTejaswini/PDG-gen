import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long M = 1_000_000_007L;
		int n = sc.nextInt();
		sc.nextLine();
		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();
		List<Integer> c = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (s[i] == t[i]) {
				c.add(0);
			} else {
				c.add(1);
				i++;
			}
		}

		long a;
		if (c.get(0) == 0) {
			a = 3;
		} else {
			a = 6;
		}

		for (int i = 1; i < c.size(); i++) {
			int prev = c.get(i - 1);
			int x = c.get(i);
			if (prev == 1) {
				if (x == 0) {
					a *= 1;
				} else {
					a = (a * 3) % M;
				}
			} else {
				a = (a * 2) % M;
			}
		}
		System.out.println(a);
	}
}
