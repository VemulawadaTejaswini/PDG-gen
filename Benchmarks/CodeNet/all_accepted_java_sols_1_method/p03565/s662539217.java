import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
//       int N = sc.nextInt();
//       int M = sc.nextInt();
       String S = sc.next();
       String T = sc.next();
       char[] s = S.toCharArray();
       char[] t = T.toCharArray();
       int f=-1;
       for (int i=s.length-t.length ; i>=0; i--) {
    	   boolean flg=false;
    	   for(int j=0;j<t.length;j++) {
    		   if(s[i+j]!=t[j]&&s[i+j]!='?') {
    			   flg=true;
    			   break;
    		   }
    	   }
    	   if(flg==false) {
    		   f=i;
    		   break;
    	   }
       }
       String ans;
       if(f==-1) {
    	   ans="UNRESTORABLE";
       } else {
		   ans=S.substring(0,f) + T + S.substring(f+T.length());
       }
       ans=ans.replace("?", "a");
       System.out.println(ans);
   }
      

}