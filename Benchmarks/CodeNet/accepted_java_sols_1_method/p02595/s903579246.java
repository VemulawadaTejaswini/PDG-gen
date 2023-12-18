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
	        long D = sc.nextInt();
	        long d2 = D*D;
	        long ans =0;
	        for (int i=0 ; i<N; i++) {
	            long a = Long.parseLong(sc.next());
	            long b = Long.parseLong(sc.next());
	            if(a*a+b*b<=d2)ans++;
	        }
	        System.out.println(ans);
		 }
		 
	}