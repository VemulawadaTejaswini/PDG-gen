import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       
       Long[][] m = new Long[(int)M][4];
       for (int i=0 ; i<M; i++) {
           m[i][0] = (long) i;
           m[i][1] = sc.nextLong();
           m[i][2] = sc.nextLong();
       }
       
       Arrays.sort(m, (b, c) -> Long.compare(b[2], c[2]));
       int[] cnt=new int[N+5];
       Arrays.fill(cnt, 0);

       for(int i=0;i<M;i++) {
    	   double d =(double)m[i][1];
    	   
    	   cnt[(int)d]++;
    	   m[i][3]=(long) cnt[(int) d];
       }

       Arrays.sort(m, (b, c) -> Long.compare(b[0], c[0]));
	   StringBuffer s=new StringBuffer();
       for(int i=0;i<M;i++) {
    	   for(int j=0;j<6-String.valueOf( m[i][1] ).length();j++) {
        	   s.append(0);    		   
    	   }
    	   s.append(m[i][1]);
    	   for(int j=0;j<6-String.valueOf( m[i][3] ).length();j++) {
        	   s.append(0);    		   
    	   }
    	   s.append(m[i][3]);
    	   s.append("\n");
       }
	   System.out.println(s);
   }
}