import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			TreeMap<String, List<Integer>> m = new TreeMap<>();
			for(int i = 0; i < q; i++) {
				int query = sc.nextInt();
				Iterator<Integer> valueItr;
				switch(query) {
				case 0:
					String key = sc.next();
					if(!m.containsKey(key)) {
						m.put(key, new ArrayList<Integer>());
					}
					m.get(key).add(sc.nextInt());
					break;
				case 1:
					valueItr = m.getOrDefault(sc.next(), new ArrayList<Integer>()).iterator();
					if(valueItr.hasNext()) {
						System.out.println(valueItr.next());
						while(valueItr.hasNext()) {
							System.out.println(valueItr.next());
						}
					}
					break;
				case 2:
					m.remove(sc.next());
					break;
				case 3:
					Map<String, List<Integer>> sub = m.subMap(sc.next(), true, sc.next(), true);
					for(Map.Entry<String, List<Integer>> entry: sub.entrySet()) {
						valueItr = entry.getValue().iterator();
						if(valueItr.hasNext()) {
							System.out.println(String.format("%s %d", entry.getKey(), valueItr.next()));
							while(valueItr.hasNext()) {
								System.out.println(String.format("%s %d", entry.getKey(), valueItr.next()));
							}
						}
					}
					break;
				}
			}
		}
	}
}
