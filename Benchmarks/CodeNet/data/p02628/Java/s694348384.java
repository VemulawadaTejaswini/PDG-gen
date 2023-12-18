	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }	        
	        Arrays.sort(a);
	        long ans=0;
	        for(int i=0;i<K;i++) {
	        	ans=ans+a[i];
	        }

	        System.out.println(ans);
	    }
	}