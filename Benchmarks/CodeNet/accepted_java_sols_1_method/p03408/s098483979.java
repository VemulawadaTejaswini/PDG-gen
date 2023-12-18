import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		Scanner sc  =new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String[] s = new String[N];
		for(int i = 0;i < N;i++) {
			s[i] = sc.next();
			if(!map.containsKey(s[i])) {
				map.put(s[i], 1);
			}else {
				map.put(s[i], map.get(s[i])+1);
			}
		}
		int M = Integer.parseInt(sc.next());
		String[] t = new String[M];
		for(int i = 0;i < M;i++) {
			t[i] = sc.next();
			if(!map.containsKey(t[i])) {
				map.put(t[i], -1);
			}else {
				map.put(t[i], map.get(t[i])-1);
			}
		}
		sc.close();

		int max = 0;
		for(Map.Entry<String, Integer> bar : map.entrySet()) {
			if(max < bar.getValue()) {
				max = bar.getValue();
			}
		}
		System.out.println(max);
	}
}