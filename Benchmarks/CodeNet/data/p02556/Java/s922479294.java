	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        long maxwa = Long.MIN_VALUE;
	        long minwa = Long.MAX_VALUE;
	        long maxsa = Long.MIN_VALUE;
	        long minsa = Long.MAX_VALUE;
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	        	long x = Long.parseLong(sc.next());
	        	long y = Long.parseLong(sc.next());
	            maxwa= Math.max(maxwa, x+y);
	            minwa= Math.min(minwa, x+y);
	            maxsa= Math.max(maxsa, x-y);
	            minsa= Math.min(minsa, x-y);
	        }
	        long ans = Math.max(maxwa-minwa, maxsa-minsa);
	        ans=Math.max(ans, -minsa+maxsa);
	        ans=Math.max(ans, -minwa+maxwa);
	        
	        System.out.println(ans);
		 }
		 
	 
	}