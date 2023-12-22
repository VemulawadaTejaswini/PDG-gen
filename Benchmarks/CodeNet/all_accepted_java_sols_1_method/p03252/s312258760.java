import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       String S = sc.next();
       String T = sc.next();
       char[] c = S.toCharArray();
       char[] d = T.toCharArray();
       
       
       char[][] v=new char[26][2];
       int flg=0;
       int cnt=0;
       for(int i=0;i<S.length();i++) {
    	   flg=0;
    	   for(int j=0;j<cnt;j++) {
     		  if(v[j][0]==c[i]) {
    			  if(v[j][1]!=d[i]) {
    				  flg=-1;
    				  break;
    			  } else {
    				  flg=1;
    			  }
    		  }
    		  if(v[j][1]==d[i]) {
    			  if(v[j][0]!=c[i]) {
    				  flg=-1;
    				  break;
    			  }
    		  }    		  
    	   }
    	   if(flg==0) {
    		   v[cnt][0]=c[i];
    		   v[cnt][1]=d[i];
    		   cnt++;
    	   }
    	   if(flg==-1)break;
       }
       
       if(flg==-1) {
    	   System.out.println("No");
       } else {
    	   System.out.println("Yes");

       }
       
   }
}