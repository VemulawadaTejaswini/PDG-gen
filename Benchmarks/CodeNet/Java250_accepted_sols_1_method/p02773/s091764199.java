import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=Integer.parseInt(sc.next());
		List<String> S = new ArrayList();
		Set<String> ss= new HashSet();
		for(int i=0; i<N; i++) {
			String word = sc.next();
			S.add(word);
			ss.add(word);
		}
		Map<String, Integer> ans = new HashMap();
		for(String a:S) {
			if(ss.contains(a)) {
				if(ans.containsKey(a)) {
					int v = ans.get(a);
					ans.put(a,++v);
				} else {
					ans.put(a, 0);
				}
			}
		}
		int m = 0;
		for(int aa : ans.values()) {
			m= Math.max(m, aa);
		}
		List<String> aaa =new ArrayList();
		for(String a : ans.keySet()) {
			if(ans.get(a) == m) {
				aaa.add(a);
			}
		}
		Collections.sort(aaa);
		for(String aa: aaa) {
			System.out.println(aa);
		}
	}
}
