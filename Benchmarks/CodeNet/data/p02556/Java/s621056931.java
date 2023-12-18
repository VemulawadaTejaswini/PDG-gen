	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next())+Long.parseLong(sc.next());
	        }
	        Arrays.sort(a);
	        
	        
	        System.out.println(a[N-1]-a[0]);
		 }
		 
	 
	}