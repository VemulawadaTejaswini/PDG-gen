import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = (int)1e9 + 7;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e7;
	
	
	void doIt() {
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		map.put("AC", 0);
		map.put("WA", 0);
		map.put("TLE", 0);
		map.put("RE", 0);
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			map.put(S, map.get(S) + 1);
		}
		for(String i : map.keySet()) {
			System.out.println(i + " × " + map.get(i));
		}
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
 
}