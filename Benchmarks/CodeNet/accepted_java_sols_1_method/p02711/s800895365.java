import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        
	        for(int i=0;i<3;i++) {
	        	if(c[i]=='7') {
	        		System.out.println("Yes");
	        		return;
	        	}
	        }
	        
	    	System.out.println("No");
	        
	        	        	        
	 }
}
