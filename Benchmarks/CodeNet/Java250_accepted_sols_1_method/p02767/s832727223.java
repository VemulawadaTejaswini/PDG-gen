import java.util.*;
import java.util.Map.Entry;
 
class Main {
//	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
//       int B = sc.nextInt();
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       long[] a = new long[(int)N];
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
       }
       
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<=100;i++) {
    	   int sum=0;
    	   for(int j=0;j<N;j++) {
    		   sum=(int) (sum+Math.pow(a[j]-i,2));
    	   }
    	   ans=Math.min(ans, sum);
       }
       
       
       System.out.println(ans);
   }
      
}