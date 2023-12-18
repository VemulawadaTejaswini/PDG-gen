import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       
       long[] a = new long[(int)N];
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
       }
       
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       Arrays.sort(a);
       int cnt=0;
       while(a[cnt]-a[N-1]/2<0) {
    	   cnt++;
       }
       if(cnt==0) {
    	   System.out.println(a[N-1] + " " + a[0]);
    	   return;
       }
       if(cnt==N-1) {
    	   System.out.println(a[N-1] + " " + a[N-2]);
    	   return;
       }
       if(Math.abs(a[cnt-1]-a[N-1]/2.0)<Math.abs(a[cnt]-a[N-1]/2.0)) {
    	   System.out.println(a[N-1] + " " + a[cnt-1]);
    	   return;    	   
       } else {
    	   System.out.println(a[N-1] + " " + a[cnt]);
    	   return;    	       	   
       }

       
   }


}