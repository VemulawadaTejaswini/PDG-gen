import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SortedMap<String, SortedSet<Integer>> index = new TreeMap<String, SortedSet<Integer>>();
		while (in.hasNext()) {
			String str = in.next();
			SortedSet<Integer> pages;
			if (index.containsKey(str)) {
				pages = index.get(str);
			} else {
				pages = new TreeSet<Integer>();
			}
			int page = in.nextInt();
			pages.add(page);
			index.put(str, pages);
		}
		for (Entry<String, SortedSet<Integer>> idx : index.entrySet()) {
			System.out.println(idx.getKey());
			Iterator<Integer> iterator = idx.getValue().iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next());
				if (iterator.hasNext()) {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}