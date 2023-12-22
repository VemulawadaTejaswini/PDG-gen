import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		Arrays.sort(s);
		String name = s[0];
		int count = 0;
		int max = 0;
		Map<String, Integer> lists = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			if (name.equals(s[i])) {
				count++;
			} else {
				lists.put(name, count);
				count = 1;
				name = s[i];
			}
			max = Math.max(max, count);
		}
		lists.put(name, count);
		List<String> ans = new ArrayList<String>();
		for (String key : lists.keySet()) {
			if (lists.get(key) == max) {
				ans.add(key);
			}
		}
		Collections.sort(ans);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}
}