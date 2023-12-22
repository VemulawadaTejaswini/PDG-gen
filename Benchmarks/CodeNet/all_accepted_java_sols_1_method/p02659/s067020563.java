	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        long A = sc.nextLong();
	        double B = sc.nextDouble();
	        long C = Math.round(B*100);
	        long ans=A*C/100;
	        System.out.println(ans);
	    }
	}