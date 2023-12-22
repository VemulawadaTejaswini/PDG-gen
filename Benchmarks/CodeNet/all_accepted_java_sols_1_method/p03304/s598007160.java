	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        double n = sc.nextInt();
	        double m = sc.nextInt();
	        double d = sc.nextInt();
	        double ans=2*(n-d)/n;
	        if(d==0) {
	        	ans=1;
	        }
	        ans=ans*(m-1)/n;
	        
	        System.out.println(ans);
	    }
	}