
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Set<Integer>> map = new TreeMap<String, Set<Integer>>();
		while(sc.hasNext()) {
			String s = sc.next();
			int n = sc.nextInt();
			if(map.containsKey(s)) {
				map.get(s).add(n);
			}else {
				Set<Integer> set = new TreeSet<Integer>();
				set.add(n);
				map.put(s, set);
			}
		}
		sc.close();
		for(String key : map.keySet()) {
			int cnt = 1;
			int l = map.get(key).size();
			System.out.println(key);
			for(int i : map.get(key)) {
				if(l == cnt) {
					System.out.println(i);
				}else {
					System.out.printf("%d ", i);
				}
				cnt++;
			}
		}
	}
}
