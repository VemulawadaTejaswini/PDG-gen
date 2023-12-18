import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		boolean[] array = new boolean[list.get(list.size() - 1) + 100];
		for (int i = 0; i < n; i++) {
			int num = list.get(i);
			for (int j = num * 2; j < list.get(list.size() - 1) + 100; j += num) {
				array[j] = true;
			}
		}
		int count = 0;
		Set<Integer> delList = new HashSet<>();
		for (int i = 0; i < n - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				delList.add(list.get(i));
			}
		}
		list.removeAll(delList);
		for (int i = 0; i < list.size(); i++) {
			if (!array[list.get(i)]) {
				++count;
			}
		}
		System.out.println(count);
	}
}
