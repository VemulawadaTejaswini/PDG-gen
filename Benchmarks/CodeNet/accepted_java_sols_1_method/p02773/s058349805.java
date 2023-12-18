import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		int n = sc.nextInt();

		Map<String, Integer> map = new HashMap<>();

		for(int i=0;i<n;i++) {
			String s = sc.next();
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}else {
				int cnt = map.get(s) + 1;
				map.put(s,cnt);
			}
		}

		//TODO mapのキー,値でソートする方法
		int max = 0;
		ArrayList<String> ans = new ArrayList<>();

		for(Entry<String, Integer> m : map.entrySet()) {
			int val = m.getValue();
			if(val >= max) {
				max = val;
			}
		}

		for(Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue() == max) {
				ans.add(m.getKey());
			}
		}

		Collections.sort(ans);

		for(String s:ans) {
			System.out.println(s);
		}

	}
}
