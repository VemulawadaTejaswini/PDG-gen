import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		TreeMap<String,Integer> map = new TreeMap<>();
		List<String> key = new ArrayList<>();
		
		String s;
		int a;
		
		for (int i=0; i<n; i++) {
			s = sc.next();
			a = sc.nextInt();
			if (!map.containsKey(s)) {
				map.put(s,a);
				key.add(s);
			}
			else {
				map.put(s,map.get(s)+a);
			}
		}
		
		key.sort(Comparator.comparingInt(String::length)
				.thenComparing(Comparator.naturalOrder()));
				
		key.forEach(e->out.println(e+" "+map.get(e)));
		
	}
}
