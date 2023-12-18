import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       int  K = sc.nextInt();
       int max=0;
       for (int i=0 ; i<K; i++) {
    	   max=Math.max(max, sc.nextInt());
       }
       int ans=0;
	   ans=2*max-1-N;
	   if(ans<0)ans=0;
       System.out.println(ans);
       
   }
}