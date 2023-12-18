	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        long[] ans = new long[2];
	        long[] t1 = new long[2];
	        long[] t2 = new long[2];
	        ans[0]= Long.parseLong(sc.next());
	        ans[1]= Long.parseLong(sc.next());
	        for (int i=0 ; i<N-1; i++) {
	            long a = Long.parseLong(sc.next());
	            long b = Long.parseLong(sc.next());
	            long t = ans[0]/a;
	            if(ans[0]%a!=0)t++;
	            t1[0]=a*t;
	            t1[1]=t1[0]/a*b;
	            t = ans[1]/b;
	            if(ans[1]%b!=0)t++;
	            t2[1]=b*t;
	            t2[0]=t2[1]/b*a;
	            if(t1[0]<t2[0]) {
	            	ans[0]=t2[0];
	            	ans[1]=t2[1];	            	
	            } else {
	            	ans[0]=t1[0];
	            	ans[1]=t1[1];
	            }

	        }


	        System.out.println(ans[0]+ans[1]);
		 }
	}