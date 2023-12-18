import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int[] b=new int[9];
       for(int i=0;i<9;i++){
    	   b[i]=sc.nextInt();
       }
       int  N = sc.nextInt();
       boolean[] m=new boolean[9];
       for(int i=0;i<N;i++) {
    	   int tmp=sc.nextInt();
    	   for(int j=0;j<9;j++) {
    		   if(tmp==b[j]) {
    			   m[j]=true;
    		   }
    	   }
       }
       String ans="No";
       if(m[0]&&m[1]&&m[2] ||
    	    	m[3]&&m[4]&&m[5] ||
    	    	m[6]&&m[7]&&m[8] ||
    	    	m[0]&&m[3]&&m[6] ||
    	    	m[1]&&m[4]&&m[7] ||
    	    	m[2]&&m[5]&&m[8] ||
    	    	m[0]&&m[4]&&m[8] ||
    	    	m[2]&&m[4]&&m[6] ) {
    	   ans="Yes";
       }
       System.out.println(ans);
   }
}