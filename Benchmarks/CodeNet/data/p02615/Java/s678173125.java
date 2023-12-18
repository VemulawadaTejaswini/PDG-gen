	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        int H = sc.nextInt();
	        long[] a = new long[H];
	        for(int i=0;i<H;i++) {
	        	a[i] = sc.nextLong();
	        }
	        
	        Arrays.sort(a);
	        long ans = 0;
	        for(int i=1;i<H;i++) {
	        	ans=ans+a[i];
	        }
	        
	        System.out.println(ans);

		 }
	}