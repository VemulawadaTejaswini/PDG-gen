import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (list.contains(num)) {
				map.put(num, 1);
			} else {
				list.add(num);
			}
		}
		if (N == 1) {
			System.out.println(0);
			return;
		}
		Collections.sort(list);
		long count = 0;
		for (int i = 0; i < list.size(); i++) {
			boolean key = true;
			int num = list.get(i);
			if (map.containsKey(num)) {
				continue;
			} else {
				for (int j = 0; j < i; j++) {
					if (num%list.get(j) == 0) {
						key = false;
					}
				}
				if (key) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}