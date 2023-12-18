	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        String S = sc.next();
	        char[] c = S.toCharArray();

	        int a = c[0]-'a';
	        if(a<26&&a>=0) {
	        	System.out.println('a');
	        } else {
	        	System.out.println('A');
	        }

	    }
	}