import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int count = 0;
    	for (int i = 1; i < N+1; i++) {
    		String bi = Integer.toString(sc.nextInt(), 2);
    		for (int j = bi.length()-1; 0 < j; j--) {
    			if (bi.charAt(j) == '0') {
    				count++;
    			} else {
    				break;
    			}
    		}
    	}
    	System.out.println(count);
    }
}