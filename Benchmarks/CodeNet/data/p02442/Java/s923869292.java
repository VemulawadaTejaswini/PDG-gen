import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int m = sc.nextInt();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			list2.add(sc.nextInt());
		}
		int size = Math.min(list.size(), list2.size());
		int res = -1;
		for (int i = 0; i < size; i++) {
			if (list2.get(i) > list.get(i)) {
				res = 1;
				break;
			} else if (list2.get(i) < list.get(i)) {
				res = 0;
				break;
			}
		}
		if (res < 0) {
			if (m > n) {
				res = 1;
			} else {
				res = 0;
			}
		}
		System.out.println(res);
	}
}


