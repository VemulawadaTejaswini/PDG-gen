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
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }

	        long ans = 1000;

	        
	        for(int i=1;i<N;i++) {
	        	if(a[i-1]<a[i]) {
	        		ans = ans/a[i-1] * a[i] + ans%a[i-1];
	        	}
	        }
	        
	        System.out.println(ans);
	        
		 }
		 
	}