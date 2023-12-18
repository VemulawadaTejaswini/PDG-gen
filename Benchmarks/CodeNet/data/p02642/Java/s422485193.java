import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		long count = 0;
		for (int i = 0; i < N; i++) {
			boolean key = true;
			int num = list.get(i);
			for (int j = 0; j < i; j++) {
				if (num%list.get(j) == 0) {
					key = false;
				}
			}
			if (key) {
				count++;
			}
		}
		if (list.get(0) == list.get(1)) {
			count--;
		}
		System.out.println(count);
	}
}