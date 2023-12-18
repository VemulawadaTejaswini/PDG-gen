import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long N = sc.nextLong();
    	long A = sc.nextLong();
    	long B = sc.nextLong();
    	if ((B-A)%2 == 0) {
    		System.out.println((B-A)/2);
    	} else {
    		if (N-A < B-1) {
    			System.out.println((B-A-1)/2+(N-B+1));
    		} else {
    			System.out.println((B-A-1)/2+A);
    		}
    	}
    }
}