	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        int[] a = new int[N];
	        int[] m = new int[1000000];
	        long sum=0;
	        for (int i=0 ; i<N; i++) {
	            a[i] = sc.nextInt();
	            m[a[i]]++;
	            sum=sum+a[i];
	        }
	        StringBuffer ans = new StringBuffer();
	        int Q = sc.nextInt();
	        for(int i=0;i<Q;i++) {
	        	int b = sc.nextInt();
	        	int c = sc.nextInt();
	        	sum=sum+m[b]*(c-b);
	        	m[c]=m[c]+m[b];
	        	m[b]=0;
	        	ans.append(sum);
	        	ans.append("\n");
	        }
	        

	        System.out.println(ans);
	    }
	}