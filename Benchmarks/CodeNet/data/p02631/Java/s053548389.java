	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        long[] a = new long[N];
	        int[] m = new int[1000000];
	        long sum=0;
	        for (int i=0 ; i<N; i++) {
	        	a[i] = Long.parseLong(sc.next());
	            sum=sum^a[i];
	        }
	        long[] ans = new long[N];
	        for(int i=0;i<N;i++) {
	        	ans[i]=sum^a[i];
	        	 System.out.println(ans[i]);
	        }
	        
	       
	    }
	}