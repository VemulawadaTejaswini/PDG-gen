import java.util.*;

public class Main
 {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int A,B;
	    A = in.nextInt();
	    B = in.nextInt();
	    int max = Math.max(A+B, Math.max(A-B, A*B));
	    System.out.println(max);

	    
	 }
	
	 

}

