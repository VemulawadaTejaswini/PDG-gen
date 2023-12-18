	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int H = (int) (Math.pow(10,7)+5);
	        int[] m = new int[H];
	        for(int i=1;i<H;i++) {
        		for(int j=i;j<H;j=j+i) {
        			m[j]++;
        		}
	        }
	        
	        int N = sc.nextInt();
	        long ans=0;
	        for(int i=1;i<=N;i++) {
	        	ans=ans+(long)(i*(long)m[i]);
	        }
	        System.out.println(ans);
		 }
	}