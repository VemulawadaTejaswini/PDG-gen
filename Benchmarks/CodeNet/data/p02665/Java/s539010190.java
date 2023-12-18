	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        
	        int N = sc.nextInt()+1;	
	        int[] a = new int[N];
	        long sum=0;
	        for (int i=0 ; i<N; i++) {
	            a[i] = Integer.parseInt(sc.next());
	            sum=sum+a[i];
	        }
	        long cnt=0;
	        long[] m = new long[50];
	        m[0]=1;
	        for(int i=1;i<50;i++) {
	        	m[i]=m[i-1]*2;
	        }
	        for(int i=0;i<Math.min(N, 26);i++) {
	        	cnt=cnt*2+a[i];
	        	if(cnt>Math.pow(2, i)) {
	        		System.out.println(-1);
	        		return;
	        	}
	        }
	        long ans=0;
	        long ro=1;
	        for(int i=0;i<N;i++) {
	        	ans=ans+Math.min(ro, sum);
	        	sum=sum-a[i];
	        	ro=ro-a[i];
	        	ro=ro*2;
	        }
	        
	        
	        
	        System.out.println(ans);
	    }
	}