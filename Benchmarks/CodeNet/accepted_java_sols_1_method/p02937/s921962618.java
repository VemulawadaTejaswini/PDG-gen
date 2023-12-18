import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		HashMap<Character, TreeSet<Integer>> place = new HashMap<>();
		for (int i = 'a'; i <= 'z'; i++) {
		    place.put((char)i, new TreeSet<>());
		}
		for (int i = 0; i < s.length; i++) {
		    place.get(s[i]).add(i);
		}
		String t = sc.next();
		Integer cur = 0;
		long times = 0;
		for (char c : t.toCharArray()) {
		    if (place.get(c).size() == 0) {
		        System.out.println(-1);
		        return;
		    }
		    cur = place.get(c).ceiling(cur);
		    if (cur == null) {
		        times++;
		        cur = place.get(c).ceiling(0);
		    }
		    cur++;
		}
		System.out.println(times * s.length + cur);
   }
}
