	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextLong();	
	        long ans=0;
	        long m=2;
	        while(m<N) {
	        	long Q = N/m;
	        	long R = N%m;
	        	if(R!=0&&R%Q==0) {
	        		ans=ans+m+R/Q-1;
	        	}
	        	m=m+R/Q+1;
	        }
	        
	        
	    	System.out.println(ans);
	    	
	        		
	    }
	    

	}