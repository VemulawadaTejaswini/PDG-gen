import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in).useDelimiter("[\\s,]+");
		TreeMap<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
		int c = 0;
		while (true) {
			int v = sc.nextInt();
			int k = sc.nextInt();
			if (k == 0 && v == 0)
				break;
			List<Integer> list = map.get(k);
			if (list == null) {
				list = new LinkedList<Integer>();
				map.put(k, list);
			}
			list.add(v);
			c++;
		}
		int[] r = new int[c + 1];
		int n = map.size();
		while (!map.isEmpty()) {
			Entry<Integer, List<Integer>> e = map.pollFirstEntry();
			for (Integer i : e.getValue()) {
				r[i.intValue()] = n;
			}
			n--;
		}
		while (sc.hasNextInt()) {
			System.out.println(r[sc.nextInt()]);
		}
	}
}