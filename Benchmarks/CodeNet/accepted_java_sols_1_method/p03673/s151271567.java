import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		List<Integer> list0 = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				list0.add(a[i]);
			} else {
				list1.add(a[i]);
			}
		}

		if (list1.isEmpty()) {
			System.out.println(list0.get(0));
			return;
		}

		StringBuilder sb = new StringBuilder();
		if (n % 2 == 0) {
			Collections.reverse(list1);
			for (int e : list1) {
				sb.append(e).append(' ');
			}
			for (int e : list0) {
				sb.append(e).append(' ');
			}
		} else {
			Collections.reverse(list0);
			for (int e : list0) {
				sb.append(e).append(' ');
			}
			for (int e : list1) {
				sb.append(e).append(' ');
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
