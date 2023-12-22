
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int n,m,hangout;
	    int assignment = 0;  // n days , m assingment
	 
	    n = sc.nextInt();
	    m = sc.nextInt();
	    
	    int[] arr = new int[m];
	    
	    for(int i = 0; i<m; i++) {
	    	arr[i] = sc.nextInt();
	    	assignment = assignment+arr[i];
	    }
	    hangout = n-assignment;
	    
	    
	    if(hangout>=0) {
	    	System.out.println(hangout);
	    }
	    else {
	    	System.out.println("-1");
	    }
	    
	    

	}

}
