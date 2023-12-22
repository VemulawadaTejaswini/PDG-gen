import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       long sum=0;
       long cnt=0;
       long[] a = new long[N];
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
       }

       Arrays.sort(a);
       for(int i=0;i<N-1;i++) {
    	   sum=sum+a[i];
    	   if(sum*2<a[i+1]) {
    		   cnt=i+1;
    	   }
       }
       
       
       System.out.println(N-cnt);
   }
}