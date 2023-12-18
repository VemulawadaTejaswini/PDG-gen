import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		String[] s = S.split(" ");
		String a = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String t : s) {
			if(a.length() < t.length()) {
				a = t;
			}
			map.merge(t, 1, (v1, v2) -> v1 + v2);
		}
		String b = "";
		int m = 0;
		for(String k : map.keySet()) {
			if(m < map.get(k)) {
				m = map.get(k);
				b = k;
			}
		}
		System.out.printf("%s %s\n", b, a);
	}
}
