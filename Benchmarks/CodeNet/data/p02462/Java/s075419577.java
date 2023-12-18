import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count = 0;
		TreeMap<String, ArrayList<Integer>> map = new TreeMap<>();

		for(int i = 0; i < n; i++) {
			int query = scan.nextInt();
			String key = scan.next();

			switch(query) {

			case 0:	//insert
				int value = scan.nextInt();
				if(!map.containsKey(key)) map.put(key, new ArrayList<Integer>());	//WARNING
				map.get(key).add(value);
				break;

			case 1:	//find
				if(map.get(key) != null)
					for(Integer x : map.get(key)) {
						System.out.println(x);
					}
					break;

			case 2:	//delete
				if(map.get(key) != null) {
					map.remove(key);
				}
				break;

			case 3:	//dump
				String tilKey = scan.next();
				Map<String, ArrayList<Integer>> subM = map.subMap(key,true, tilKey,true);
				for(String x : subM.keySet()){
					for(Integer x2 : subM.get(x)) {
						System.out.println(x + " " + x2);
					}
				}
				break;
			}
		}
	}
}
