	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long a = sc.nextInt();	
	        long b = sc.nextInt();	
	        long c = sc.nextInt();	
	        long d = sc.nextInt();	
	        long ans=a*c;
	        ans=Math.max(ans,b*d);
	        ans=Math.max(ans,a*d);
	        ans=Math.max(ans,b*c);
	        
	        
	        
	        System.out.println(ans);
		 }
		 
	}