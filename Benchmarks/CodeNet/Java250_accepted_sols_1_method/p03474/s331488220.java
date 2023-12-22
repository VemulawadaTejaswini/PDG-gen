import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	String S = sc.next();
    	String ans = "Yes";
    	for (int i = 0; i < S.length(); i++) {
    		if ((i == A && S.charAt(i) != '-') || (i != A && S.charAt(i) == '-')) {
    				ans = "No";
    		}
    	}
    	System.out.println(ans);
    }
}