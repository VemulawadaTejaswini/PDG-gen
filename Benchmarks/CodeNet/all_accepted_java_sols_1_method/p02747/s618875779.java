import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        String ans="Yes";
	        if(c.length%2==1) {
	        	System.out.println("No");
	        	return;
	        }
	        for(int i=0;i<c.length-1;i=i+2) {
	        	if(c[i]!='h'||c[i+1]!='i') {
	        		ans="No";
	        	}
	        }
	        System.out.println(ans);
	 }
}