import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Set<Integer> aSet = map.getOrDefault(a, new HashSet<>());
			aSet.add(b);
			map.put(a, aSet);

			Set<Integer> bSet = map.getOrDefault(b, new HashSet<>());
			bSet.add(a);
			map.put(b, bSet);
		}
		sc.close();

		int count = 0;
		for (int i = 0; i < n; i++) {
			Integer h = list.get(i);
			Set<Integer> set = map.getOrDefault(i + 1, new HashSet<>());
			boolean flag = true;
			for (Integer e : set) {
				Integer hTemp = list.get(e - 1);
				if (h <= hTemp) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}
