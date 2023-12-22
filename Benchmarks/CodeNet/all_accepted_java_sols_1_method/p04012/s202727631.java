import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		sc.close();
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0;i < w.length();++i) {
			if(map.containsKey(w.charAt(i))) {
				Integer cap = map.get(w.charAt(i));
				map.remove(w.charAt(i));
				map.put(w.charAt(i), cap+1);
			} else {
				map.put(w.charAt(i), 1);
			}
		}
		boolean flag = true;
		for(Character c : map.keySet()) {
			if(map.get(c) % 2 != 0) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
