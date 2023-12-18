	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int K = sc.nextInt();
	        long ans =0;
	        long tmp=0;
	        long now=7;
	        for (int i=0 ; i<K+100; i++) {
	        	tmp=tmp+now;
	        	if(tmp%K==0) {
	        		System.out.println(i+1);
	        		return;
	        	}

	        	now=(now*10)%K;
	        }
	        System.out.println(-1);
		 }
		 
	}