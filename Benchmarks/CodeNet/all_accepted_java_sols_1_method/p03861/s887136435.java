import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        long ans=0;
        if(a==0) {
        	if(x!=1) {
        		ans++;
        	}
        }
        
        ans=ans+b/x-(a-1)/x;
        System.out.println(ans);        	
                		
    }

}