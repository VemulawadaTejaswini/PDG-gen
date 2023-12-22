import java.util.*;

public class Main {
	Scanner sc;
	Map<String, Integer> h;
	int N;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		h = new HashMap<>();
		for (int i = 0; i < N; i++) {
			char[] cs = sc.next().toCharArray();
			Arrays.sort(cs);
			String s = new String(cs);
			h.put(s, h.getOrDefault(s, 0)+1);
		}
		long result = 0L;
		for (String s : h.keySet()) {
			int cnt = h.get(s);
			if (cnt <= 1) continue;
			result = result + ((long)cnt)*(cnt-1)/2;
		}
		out(result);
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}