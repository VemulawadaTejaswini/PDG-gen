import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
//       int M = sc.nextInt();
       String S = sc.next();
//       String T = sc.next();
       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       boolean[] m = new boolean[1000];
       for (int i=0; i<1000; i++) {
    	   	int c1=i%10;
    	   	int c2=i/10%10;
       		int c3=i/100;
       		boolean flg1=false;
       		boolean flg2=false;
       		boolean flg3=false;
       		for(int j=0;j<N;j++) {
       			if(flg1==false&&c1==Character.getNumericValue(s[j])) {
       				flg1=true;
       				continue;
       			}
       			if(flg2==false&&flg1==true&&c2==Character.getNumericValue(s[j])) {
       				flg2=true;
       				continue;
       			}
       			if(flg2==true&&c3==Character.getNumericValue(s[j])) {
       				flg3=true;
       				break;
       			}
       		}
       		if(flg3==true) {
       			m[i]=true;
       		}
       }
       
       int ans=0;
       for(int i=0;i<1000;i++) {
    	   if(m[i]==true) {
    		   ans++;
    	   }
       }

       System.out.println(ans);
   }
      

}