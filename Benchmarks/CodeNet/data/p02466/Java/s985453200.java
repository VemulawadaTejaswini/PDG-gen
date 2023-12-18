
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
		StringBuilder sb = new StringBuilder();
		Set<Integer> set1 = new TreeSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set1.add(sc.nextInt());
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			set2.add(sc.nextInt());
		}
		Set<Integer> set3 = new HashSet<>(set2);
		set2.retainAll(set1);
		set3.removeAll(set2);
		set1.removeAll(set2);
		set1.addAll(set3);
		for (int num : set1) {
			sb.append(num);
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
}

