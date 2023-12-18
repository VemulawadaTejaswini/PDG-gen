import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	          
	   Scanner sc = new Scanner(System.in);
       long  A = sc.nextLong();
       long  B = sc.nextLong();

       long tmpA=A*100/8;
       long tmpB=B*10;
       
       long[] mA=new long[100];
       int Acnt=0;
       for(long i=tmpA-50;i<tmpA+50;i++) {
    	   if((i*108/100)-(i)==A) {
    		   mA[Acnt]=i;
    		   Acnt++;
    	   }
       }
       long[] mB=new long[100];
       int Bcnt=0;
       for(long i=tmpB-50;i<tmpB+50;i++) {
    	   if((i*110/100)-(i)==B) {
    		   mB[Bcnt]=i;
    		   Bcnt++;
    	   }
       }
       long ans=-1;
       for(int i=0;i<Acnt;i++) {
    	   for(int j=0;j<Bcnt;j++) {
    		   if(mA[i]==mB[j]) {
    			   ans=mA[i];
    			   System.out.println(ans);
    			   return;
    		   }
    	   }
       }
       
       System.out.println(ans); 
       return;
   }

}
