import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N=Integer.parseInt(scanner.next());
	    int M=Integer.parseInt(scanner.next());
	    long[] A=new long[N];
	    long[] B=new long[N];
	    Map<Long, Long> map = new HashMap<Long, Long>();


	    for(int i=0; i<N;i++) {
	    	A[i]=Long.parseLong(scanner.next());
	    	B[i]=Long.parseLong(scanner.next());
	    	if (map.containsKey(A[i])) {
	    		map.put(A[i], map.get(A[i]) + B[i]);
	    	} else {
	    		map.put(A[i], B[i]);
	    	}
	    }
	    
	    Arrays.parallelSort(A);
	    
	    long h=0;
	    long c=0;
	    for (int i=0; i<N; i++) {
	    	if (i!=0 && A[i] == A[i-1]) continue;
	    	
	    	long hm = map.get(A[i]);
	    	for (int j = 0; j < hm; j++) {
	    		h++;
	    		c+=A[i];
	    		if (h==M) {
	    			System.out.println(c);
	    			return;
	    		}
	    	}
	    }

	}
}