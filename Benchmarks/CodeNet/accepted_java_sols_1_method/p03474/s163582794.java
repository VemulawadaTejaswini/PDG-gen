import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	String S = sc.next();
    	boolean key = true;
    	for (int i = 0; i < S.length(); i++) {
    		if (i == A) {
    			if (S.charAt(i) != '-') {
    				key = false;
    			}
    		} else {
    			if (!S.substring(i, i+1).matches("[0-9]")) {
    				key = false;
    			}
    		}
    	}
    	System.out.println(key ? "Yes" : "No");
    }
}