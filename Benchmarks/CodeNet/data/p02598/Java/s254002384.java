	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        long K = sc.nextInt();
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }	        
	        
	        long left=0;
	        long right=mod;
	        while(right-left>1) {
	        	long mid = left + (right-left)/2;
	        	long cnt =0;
	        	for(int i=0;i<N;i++) {	        			
	        		cnt=cnt+a[i]/mid-1;
	        		if(a[i]%mid!=0)cnt++;
	        	}
	        	if(cnt>K) {
	        		left=mid;
	        	} else {
	        		right=mid;
	        	}
	        }
	        
	        
	        
	        System.out.println(right);
		 }
		 
	}