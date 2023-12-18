import java.util.*;
import java.util.stream.Collectors;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			String s = sc.next();
			map.put(s, map.getOrDefault(s,0)+1);
		}
		
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			String s = sc.next();
			map.put(s, map.getOrDefault(s,0)-1);
		}
		
		map = map.entrySet().stream()
				.sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
				.collect(Collectors.
						toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));
		
		System.out.println(Math.max(map.values().stream().findFirst().get(), 0));
		
	}
}