import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	long K = sc.nextLong();
    	int i = 0;
    	for (; i < S.length(); i++) {
    		if (S.charAt(i) == '1') {
    			continue;
    		} else {
    			break;
    		}
    	}
    	if (K <= i) {
    		System.out.println(1);
    	} else {
    		System.out.println(S.charAt(i));
    	}
    }
}