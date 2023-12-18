	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        String T = sc.next();
	        T = T.substring(0,S.length());
	        if(S.equals(T)) {
	        	System.out.println("Yes");
	        } else {
	        	System.out.println("No");
	        }
	        
	    }
	}