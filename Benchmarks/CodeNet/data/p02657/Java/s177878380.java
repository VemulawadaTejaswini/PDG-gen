import java.util.*;
 
public class Main {
 
	public static void main(String[] arguments) {
    
    	Scanner scan = new Scanner(System.in);
       	int N = scan.nextInt();
        
        int product = 1;
        
        for (int i = 1; i <= N; i++) {
        	int A_i = scan.nextInt();
            
            product = product * A_i;
        }
        
        if (product < 10^18) {
        	System.out.println(product);
        }
        
        else {
        	System.out.println("-1");
		}
    }
}