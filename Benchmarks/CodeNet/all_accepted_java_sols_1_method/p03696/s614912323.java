import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        
	        int lcnt=0;
	        int rcnt=0;
	        int min=0;
	        for(int i=0;i<N;i++) {
	        	if(c[i]=='(')lcnt++;
	        	else lcnt--;
	        	min=Math.min(min, lcnt);
	        }
	        
	        for(int i=0;i<-min;i++) {
	        	System.out.print("(");
	        	lcnt++;
	        }
	        
	        if(lcnt>rcnt) {
        		System.out.print(S);
	        	for(int i=0;i<lcnt-rcnt;i++) {
	        		System.out.print(")");
	        	}
	        		System.out.println("");
	        } else {
	        	for(int i=0;i<rcnt-lcnt;i++) {
	        		System.out.print("(");
	        	}
	       		System.out.print(S);
	      		System.out.println("");

	        }
	         
	 }
	 

}