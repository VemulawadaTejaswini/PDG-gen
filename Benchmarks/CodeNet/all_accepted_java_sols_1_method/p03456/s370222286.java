import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next();
    	String b = sc.next();
    	int ab = Integer.parseInt(a+b);
    	boolean key = false;
    	for (int i = 1; i <= Math.sqrt(ab); i++) {
    		if (i*i == ab) {
    			key = true;
    		}
    	}
    	System.out.println(key ? "Yes" : "No");
    }
}