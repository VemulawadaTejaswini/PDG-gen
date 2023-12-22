import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        int N=c.length;
	        String subS1=S.substring(0,(N-1)/2);
	        String subS2=S.substring((N+1)/2);
	        char[] c1 = subS1.toCharArray();
	        char[] c2 = subS2.toCharArray();
	        int n1=c1.length;
	        int n2=c2.length;
	        boolean flg=false;
	        for(int i=0;i<(N-1)/2;i++) {
	        	if(c[i]!=c[N-i-1])flg=true;
	        }
	        for(int i=0;i<n1/2;i++) {
	        	if(c1[i]!=c1[n1-1-i])flg=true;
	        }
	        for(int i=0;i<n2/2;i++) {
	        	if(c2[i]!=c2[n2-1-i])flg=true;
	        }
	        if(flg) {
		        System.out.println("No");	        	
	        } else {
	        	System.out.println("Yes");	
	        }
	 }
	 

}