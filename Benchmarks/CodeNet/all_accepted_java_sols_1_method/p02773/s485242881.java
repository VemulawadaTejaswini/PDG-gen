import java.util.*;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		TreeMap<String, Integer> s = new TreeMap<>();
		int max = 1;

		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			
			if (s.containsKey(tmp)) {
				s.put(tmp, s.get(tmp) + 1);
				max = Math.max(max, s.get(tmp));
			} else {
				s.put(tmp, 1);
			}
		}
		
		for (String key : s.keySet()) {
			if (max == s.get(key)) {
				System.out.println(key);
			}
		}
	}
}  
