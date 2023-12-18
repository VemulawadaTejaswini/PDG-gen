import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args){
		int i, j, q, order, x;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				order = sc.nextInt();
				x = sc.nextInt();
				switch(order) {
				case 0 :
					if(!set.add(x)) {
						map.computeIfAbsent(x, old -> old++);
					}
					System.out.println(set.size() + map.size());
					break;
				case 1 :
					if(set.contains(x)) {
						if(map.containsKey(x)) {
							System.out.println(map.get(x) + 1);
						}else {
							System.out.println(1);
						}
						
					}else {
						System.out.println(0);
					}
					break;
				case 2 :
					if(set.remove(x)) {
						map.remove(x);
					}
					break;
				case 3 :
					for(Integer output : set.subSet(x, true, sc.nextInt(), true)) {
						System.out.println(output);
						if(map.containsKey(output)) {
							for(j = 0; j < map.get(output); j++) {
								System.out.println(output);
							}
						}
					}
					break;
				}
			}
		}
	}
}
