
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	TreeMap<String, TreeSet<Integer>> map = new TreeMap<String, TreeSet<Integer>>();
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			String key = sc.next();
//			if(key.equals("0")) break;
			int value = sc.nextInt();
			if(map.containsKey(key)) {
				TreeSet<Integer> list = map.get(key);
				list.add(value);
				map.put(key, list);
			}
			else {
				TreeSet<Integer> list = new TreeSet<Integer>();
				list.add(value);
				map.put(key, list);
			}
		}
		for(Map.Entry<String, TreeSet<Integer>> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			TreeSet<Integer> list = entry.getValue();
			for(java.util.Iterator<Integer> i=list.iterator();i.hasNext();) {
				int ind = i.next();
				System.out.print(ind);
				if(i.hasNext()) System.out.print(" ");
				else System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
}