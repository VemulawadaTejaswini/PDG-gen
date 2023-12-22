import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        
	        int cnt1=N/K;
	        long ans=(long)Math.pow(cnt1, 3);
	        if(K%2==0) {
	        	int cnt2=(N+K/2)/K;
	        	ans=ans+(long)Math.pow(cnt2,3);
	        }
	   	 	
	   	 System.out.println(ans);
	 }
	 

}