	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int M = sc.nextInt();
	        int[][] m = new int[H][W];
	        int[] h = new int[H];
	        int[] w = new int[W];
	        int ans=0;
	        int[][] b = new int[M][2]; 
	        for(int i=0;i<M;i++) {
	        	int x =sc.nextInt()-1;
	        	int y =sc.nextInt()-1;
	        	m[x][y]++;
	        	h[x]++;
	        	w[y]++;
	        }
	        Arrays.sort(h);
	        Arrays.sort(w);
	        for(int i=H-1;i>=0&&h[i]>=h[H-1]-1;i--) {
	        	for(int j=W-1;j>=0&&w[j]>=w[W-1];j--) {
	        		ans=Math.max(ans, h[i]+w[j]-m[i][j]);
	        		
	        	}
	        }
	        System.out.println(ans);
		 }
		 
	}