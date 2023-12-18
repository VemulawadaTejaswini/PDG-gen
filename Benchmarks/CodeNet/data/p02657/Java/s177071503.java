import java.util.*;
 
public class Main {
 
	public static void main(String[] arguments) {
    
    	Scanner scan = new Scanner(System.in);
       	int N = scan.nextInt();
        
        double product = 1;
      	double limit = Math.pow(10,18);
        
        while (i <= N) {
        	int A_i = scan.nextInt();
            
            product = product * A_i;
        }
        
        if (product < limit) {
        	System.out.println(product);
        }
        
        else {
        	System.out.println("-1");
		}
    }
}