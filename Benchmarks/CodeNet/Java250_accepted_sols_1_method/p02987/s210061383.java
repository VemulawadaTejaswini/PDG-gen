import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		HashMap<Character, Integer> hm = new HashMap<>();
		char ch=' ';
		for(int i = 0; i < 4; i++) {
			ch = S.charAt(i);
			if(!hm.containsKey(ch)) {
				hm.put(ch, 1);
			}
			else {
				hm.put(ch, hm.get(ch) + 1);
			}
		}
		System.out.println((hm.size() == 2 && hm.get(ch) == 2)?"Yes":"No");
	}
}