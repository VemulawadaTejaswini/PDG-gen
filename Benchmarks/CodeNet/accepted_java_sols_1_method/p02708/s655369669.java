import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextInt();	
	        int K = sc.nextInt();	
	        long[] a = new long[(int)N];
	        long ans =0;
	        long tmp=0;
	        for (int i=K ; i<=N+1; i++) {
	        	tmp=i;
	        	tmp=(tmp*(tmp-1)/2);
	            ans=(ans+(i*N)-2*tmp+1)%mod;
	            
	        }
	        
	        System.out.println(ans);
	        
	 }

}