import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long a = sc.nextLong();
	        long b = sc.nextLong();
	        long c = sc.nextLong();
	        
	        long sahen = (a+b-c)*(a+b-c)-4*a*b;
	        	
	        
	        if(sahen>0&&a+b-c<0) {
	        	System.out.println("Yes");
	        } else {
	        	System.out.println("No");
	        }

	        
	 }
	 

}
