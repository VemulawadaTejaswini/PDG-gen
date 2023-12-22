import java.util.ArrayList;
		import java.util.Collection;
		import java.util.Collections;
		import java.util.List;
		import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			l.add(sc.nextInt());
			r.add(sc.nextInt());
		}
		int min = Collections.max(l);
		int max = Collections.min(r);
		int num = Math.min(max, n) + 1 - Math.max(min, 1);
		if (num < 0) {
			num = 0;
		}
		System.out.println(num);
	}
}
