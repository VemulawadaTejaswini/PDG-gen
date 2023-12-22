import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    if (N<=5)
	    	System.out.println(0);
	    else if (N<=12)
	    	System.out.println(M/2);
	    else
	    	System.out.println(M);
	    
	    sc.close();

	}
	

}