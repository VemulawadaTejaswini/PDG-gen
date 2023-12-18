	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        long N = sc.nextLong()-1;
	        int[] m = new int[100];
	        int cnt=0;
	        for(int i=0;N>=0;i++) {
	        	m[i]=(int) (N%26);
	        	N=N/26-1;
	        	cnt++;
	        }
	        StringBuffer ans = new StringBuffer();
	        for(int i=cnt-1;i>=0;i--) {
	        	ans.append((char)('a'+m[i]));
	        	
	        }
	        System.out.println(ans);
	    }
	}