import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	String s = Character.toString(S.charAt(0));
    	String tmp = "";
    	int count = 1;
    	for (int i = 1; i < S.length(); i++) {
    		tmp += Character.toString(S.charAt(i));
    		if (!s.equals(tmp)) {
    			s = tmp;
    			tmp = "";
    			count++;
    		} 
    	}
    	System.out.println(count);
    }
}