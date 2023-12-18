import com.sun.source.util.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> list = new HashSet<>();
		Set<Integer> delList = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (list.contains(num)) {
				delList.add(num);
			} else {
				list.add(num);
			}
		}
		int max = Collections.max(list);
		boolean[] array = new boolean[max * 2 + 100];
		for (int tmp : list) {
			for (int j = tmp * 2; j < max * 2 + 100; j += tmp) {
				array[j] = true;
			}
		}
		list.removeAll(delList);
		int count = 0;
		for (int num : list) {
			if (!array[num]) {
				++count;
			}
		}
		System.out.println(count);
	}
}
