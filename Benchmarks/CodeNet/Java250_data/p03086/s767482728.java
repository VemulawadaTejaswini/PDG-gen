import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	int count = 0;
    	int keep = 0;
    	for (char c : S.toCharArray()) {
    		if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
    			count++;
    		} else {
    			if (keep < count) {
    				keep = count;
    			}
    			count = 0;
    		}
    	}
    	System.out.println(keep < count ? count : keep);
    }
}