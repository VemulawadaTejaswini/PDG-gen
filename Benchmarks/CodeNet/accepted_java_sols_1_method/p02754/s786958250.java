import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	          
	   Scanner sc = new Scanner(System.in);
       long  N = sc.nextLong();
       long  A = sc.nextLong();
       long  B = sc.nextLong();
       long ans1=0;
       long ans2=0;
       
       ans1=A*(N/(A+B));
       ans2=B*(N/(A+B));
       if(N%(A+B)<A) {
    	   ans1=ans1+N%(A+B);
       } else {
    	   ans1=ans1+A;
    	   ans2=ans2+N%(A+B)-A;
       }
       
       
       System.out.println(ans1); 
       return;
   }

}
