	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        String S = sc.next();
	        char[] s = S.toCharArray();
	        String T = sc.next();
	        char[] t = T.toCharArray();
	        int cnt=0;
	        for(int i=0;i<s.length;i++) {
	        	if(s[i]!=t[i])cnt++;
	        }
	        System.out.println(cnt);
		 }
	}