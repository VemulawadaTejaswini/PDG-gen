import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextLong();
	        
	        long ans= (N/500) *1000;
	        ans=ans+((N%500)/5) *5;	        
        	System.out.println(ans);
	        	        
	 }
}