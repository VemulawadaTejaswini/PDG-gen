import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextLong();
	        
	        
	        long ans=0;
	        for(int i=0;i<=N;i++) {
	        	if(i%3!=0&&i%5!=0) {
	        		ans=ans+i;
	        	}
	        }
	        
	    	System.out.println(ans);
	        
	        	        	        
	 }
}
