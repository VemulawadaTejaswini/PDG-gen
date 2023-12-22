import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();

    	Map<Character, Integer> map = new HashMap<>();
    	for (int i = 0; i < 4; i++) {
    		char c = s.charAt(i);
    		if (map.containsKey(c)) {
    			int n = map.get(c);
    			n++;
    			map.put(c, n);
    		} else {
    			map.put(c, 1);
    		}
    	}
    	char c = s.charAt(0);
    	if (map.size() == 2 && map.get(c) == 2) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
   	}
}
