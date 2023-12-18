import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		long sum = 0;
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
			sum += list.get(i);
		}
		int Q = Integer.parseInt(sc.next());
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < Q; i++) {
			int tmpA = Integer.parseInt(sc.next());
			int tmpB = Integer.parseInt(sc.next());
			map.put(tmpA, tmpB);
		}
		sc.close();

		for(Integer key : map.keySet()) {
			int changeCount = Collections.frequency(list, key);
			List<Integer> list_remove = new ArrayList<>();
			list_remove.add(key);
			list.removeAll(list_remove);
			for(int i = 0; i < changeCount; i++) {
				list.add(map.get(key));
				sum = sum + (map.get(key) - key);
			}
			System.out.println(sum);
		}
	}

}