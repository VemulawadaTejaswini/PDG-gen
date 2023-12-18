import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long[] Ai = new long[N+1];
    	for (int i = 0; i < Ai.length; i++) {
    		Ai[i] = sc.nextLong();
    	}
    	long tmp = 0L;
    	long hunt = 0L;
    	for (int i = 0; i < N; i++) {
    		long B = sc.nextLong();
    		if (Ai[i] <= B + tmp) {
    			if (Ai[i] <= tmp) {
    				tmp = B;
    			} else {
    				tmp = B + tmp - Ai[i];
    			}
    			hunt += Ai[i];
    		} else {
    			hunt += B + tmp;
    			tmp = 0L;
    		}
    	}
    	if (Ai[N] <= tmp) {
    		hunt += Ai[N];
    	} else {
    		hunt += tmp;
    	}
    	System.out.println(hunt);
    }
}