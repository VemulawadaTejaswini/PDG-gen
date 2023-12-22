import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		List<Character> duplicateCharList = new ArrayList<Character>();
		Map<Integer, Integer> posMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			int lastIdx = s.lastIndexOf(ch);
			if (!duplicateCharList.contains(ch) && lastIdx != i) {
				duplicateCharList.add(ch);
				posMap.put(i, lastIdx);
			}
		}

		int maxCount = 0;
		for (int i = 0; i < n; i++) {
			int tmpCount = 0;
			Iterator<Integer> iter = posMap.keySet().iterator();
			while (iter.hasNext()) {
				int key = iter.next();
				if (key <= i && posMap.get(key) > i) {
					tmpCount++;
				}
			}
			if (maxCount < tmpCount) {
				maxCount = tmpCount;
			}
		}
		System.out.println(maxCount);

		sc.close();
	}
}