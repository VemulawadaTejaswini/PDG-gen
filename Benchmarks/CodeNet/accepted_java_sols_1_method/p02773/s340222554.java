import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			if (map.get(s) == null) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s) + 1);
			}
		}

		List<String> resultList = new ArrayList<>();
		int max = 0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > max) {
				resultList = new ArrayList<>();
				resultList.add(entry.getKey());
				max = entry.getValue();
			} else if(entry.getValue() == max) {
				resultList.add(entry.getKey());
			}
		}
		Collections.sort(resultList);
		resultList.stream().forEach(s -> System.out.println(s));
	}
}