import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    if (N==M)
	    	System.out.println(N+M);
	    
	    else if (N-1>=M)
	    	System.out.println(2*N-1);
	    
	    
	    else 
	    	System.out.println(2*M-1);
	    
	    sc.close();

	}

}