import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S[] = new String[N];
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++) {
			S[i] = sc.next();
			map.put(S[i], 1);
		}
		System.out.println(map.size());
	}
}
