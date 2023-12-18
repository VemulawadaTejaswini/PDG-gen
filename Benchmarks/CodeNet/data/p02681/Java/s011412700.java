import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	String T = sc.next();
    	String T1 = T.substring(0, S.length());
    	if (S.length() + 1 == T.length() && S.equals(T1)) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}