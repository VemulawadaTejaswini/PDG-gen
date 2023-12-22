import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] P = new int[N];
    	P[0] = sc.nextInt();
    	int error = 0;
    	boolean asc = true;
    	boolean once = true;
    	for (int i = 1; i < N; i++) {
    		P[i] = sc.nextInt();
    		if (once && !asc && error - 1 == P[i - 1]) {
    			asc = true;
				once = false;
    		} else if (P[i] < P[i - 1]) {
    			error = P[i - 1];
    			asc = false;
    		}
    	}
    	System.out.println(asc ? "YES" : "NO");
    }
}