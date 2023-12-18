import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			TreeMap<Integer, Integer> s = new TreeMap<>();
			int length = 0;
			for(int i = 0; i < q; i++) {
				int query = sc.nextInt();
				int key;
				switch(query) {
				case 0:
					key = sc.nextInt();
					s.put(key, s.getOrDefault(key, 0) + 1);
					length++;
					System.out.println(length);
					break;
				case 1:
					System.out.println(s.getOrDefault(sc.nextInt(), 0));
					break;
				case 2:
					key = sc.nextInt();
					length -= s.getOrDefault(key, 0);
					s.remove(key);
					break;
				case 3:
					Map<Integer, Integer> sub = s.subMap(sc.nextInt(), true, sc.nextInt(), true);
					for (Map.Entry<Integer, Integer> n : sub.entrySet()) {
						for(int j = 0; j < n.getValue(); j++) {
							System.out.println(n.getKey());
						}
					}
				}
			}
		}
	}
}
