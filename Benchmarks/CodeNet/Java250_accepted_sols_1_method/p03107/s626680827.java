import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	List<Character> zero = new ArrayList<>();
    	List<Character> one = new ArrayList<>();
    	for (char c : S.toCharArray()) {
    		if (c == '0') {
    			zero.add(c);
    		} else {
    			one.add(c);
    		}
    	}
    	System.out.println(2*Math.min(zero.size(), one.size()));
    }
}