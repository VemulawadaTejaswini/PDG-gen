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
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        int wcnt =0;
	        int rcnt =0;
	        int[] wm = new int[N];
	        int[] rm = new int[N];
	        
	        
	        for(int i=0;i<N;i++) {
	        	if(c[i]=='W') {
	        		wm[wcnt]=i;
	        		wcnt++;
	        	} else {
	        		rm[rcnt]=i;
	        		rcnt++;
	        	}
	        }
	        if(wcnt==0) {
	        	System.out.println(0);
	        	return;
	        }
	        long ans=0;
	        int wnow=0;
	        int rnow=rcnt-1;
	        while(wnow<N&&rnow>=0&&wm[wnow]<rm[rnow]) {
	        	ans++;
	        	wnow++;
	        	rnow--;
	        }
	        
	        
	        System.out.println(ans);
		 }
		 
	}