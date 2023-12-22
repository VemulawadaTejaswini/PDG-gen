	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        long ans=1;
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	            if((long)(Math.pow(10, 18)/ans)<a[i]) {
	            	ans=-1;
	            } else if(ans!=-1){
	            	ans=ans*a[i];
	            }
	            if(a[i]==0) {
	            	System.out.println(0);
	            	return;
	            }
	        }
	        if(ans>(long)Math.pow(10, 18))ans=-1;
    		System.out.println(ans);
	    }
	}
