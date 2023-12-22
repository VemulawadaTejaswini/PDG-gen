import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//AtCoder Beginner Contest 155
//C	Poll
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String[] S = new String[N];
		Map<String, Integer> count = new HashMap<>();
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
			if (count.containsKey(S[i])) {
				count.put(S[i], count.get(S[i]).intValue() + 1);
			} else {
				count.put(S[i], 1);
			}
		}
		sc.close();

		int max = Collections.max(count.values());
		Set<String> set = new HashSet<>();
		for (Map.Entry<String, Integer> s : count.entrySet()) {
			if (s.getValue() == max) {
				set.add(s.getKey());
			}
		}
		List<String> l = new ArrayList<>(set);
		Collections.sort(l);
		for (String s : l) {
			System.out.println(s);
		}
	}
}
