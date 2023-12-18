import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	          
	   Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       long  H = sc.nextLong();
       long[][] a = new long[N][2];
       long max=0;
       for (int i=0 ; i<N; i++) {
           a[i][0] = Long.parseLong(sc.next());
           a[i][1] = Long.parseLong(sc.next());
           max=Math.max(max, a[i][0]);
       }
       Arrays.sort(a, (b, c) -> Long.compare(b[1], c[1])); 
       
       long cnt=0;
       
       for(int i=a.length-1;i>=0;i--) {
    	   if(a[i][1]<max) {
    		   break;
    	   }
    	   H=H-a[i][1];
    	   cnt++;
    	   if(H<=0) {
    		   System.out.println(cnt);
    		   return;
    	   }
       }
	   if(H%max==0)cnt--;
       cnt=cnt+H/max+1;
       System.out.println(cnt); 
       return;
   }

}