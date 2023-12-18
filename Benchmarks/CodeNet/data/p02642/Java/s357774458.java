import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
		for (int i=0; i<n; i++){
			int a = sc.nextInt();
			if (map.containsKey(a)){
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
		}
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
	    Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
	        public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
	          return obj1.getKey().compareTo(obj2.getKey());
	        }
	     });
	    for(Entry<Integer, Integer> entry : list) {
	    	int key = entry.getKey();
	    	HashSet<Integer>set = new HashSet<Integer>();
	    	for (int a : map.keySet()){
	    		if (a == key){
	    			if (map.get(key) > 1){
	    				set.add(key);
	    			}
	    		} else {
	    			if (a % key == 0){
	    				set.add(a);
	    			}
	    		}
	    	}
	    	Iterator it = set.iterator();
	    	while (it.hasNext()){
	    		map.remove(it.next());
	    	}
	    }
	    System.out.println(map.size());
	}

}