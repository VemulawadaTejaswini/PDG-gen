	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
//		 static int mod =  (int) (Math.pow(10,9)+7);
		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextLong();
	        long X = sc.nextInt();
	        int M = sc.nextInt();
	        
	        int[] m = new int[M];
	        int[] v = new int[M];
	        int s=0;
	        int t=0;
	        long ans=0;
	        if(X==0) {
	        	System.out.println(0);
	        	return;
	        }
	        boolean flg=false;
	        for(int i=0;i<N;i++) {
	        	m[i]=(int)(X)%M;
	        	if(v[m[i]]==0) {
	        		v[(int)m[i]]=i;
	        	} else {
	        		s=v[m[i]];
	        		t=i;
	        		flg=true;
	        		break;
	        	}
	        	ans=ans+m[i];
	        	X=(X*X)%M;
	        }
	        
	        int d=0;
	        long w=0;
	        int x=0;
	        if(flg) {
		        N=N-t;
		        d=t-s;
		        if(d!=0)w=N/d;
		        else w=N;
		        if(d!=0)x=(int) (N%d);
		        else x=0;
	        }
	        X=m[s];
	        long sum=0;
	        long[] o = new long[M];
	        for(int i=0;i<d;i++) {
	        	o[i]=sum+(X)%M;
	        	X=(X*X)%M;
	        	sum=o[i];
	        }
	        
	        ans=ans+(w*sum);
	        if(x!=0) {
	        	ans=ans+o[x-1];
	        }
	        
	        
	        
	        System.out.println(ans);
		 }
	}