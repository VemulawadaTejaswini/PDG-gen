	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
//		 static int mod =  (int) (Math.pow(10,9)+7);
		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        long ans=0;
	        for(long i=1;i<N;i++) {
	        	for(long j=i;i*j<N;j++) {
	        		if(i==j)ans++;
	        		else ans=ans+2;
	        	}
	        }
	        
	        
	        System.out.println(ans);
		 }
	}
