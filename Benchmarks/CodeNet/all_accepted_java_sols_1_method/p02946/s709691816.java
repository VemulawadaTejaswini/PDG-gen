import java.util.*;

public class Main
 {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int K,X;
	    K = in.nextInt();
	    X = in.nextInt();
	    int start = X-K+1>=-1000000?X-K+1:-1000000;
	    int end = X+K-1<=1000000?X+K-1:1000000;
	    for(int i=start;i<=end;i++) {
	    	System.out.print(i+" ");
	    }

	    
	 }
	
	 

}

