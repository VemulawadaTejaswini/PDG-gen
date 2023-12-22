import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> m = new TreeMap<>();
		int max = 1;
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			if(m.containsKey(S)) {
				m.put(S, m.get(S)+1);
				max = Math.max(max, m.get(S));
			}
			else
				m.put(S, 1);
		}
		List<String> l = new ArrayList<>();
		for(String s : m.keySet()) {
			if(m.get(s) == max)
				l.add(s);
		}
		Collections.sort(l);
		for(String s : l)
			System.out.println(s);

	}

}