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
	        boolean[][] m = new boolean[H][W];
	        int[][] h = new int[H][2];
	        int[][] w = new int[W][2];
	        int ans=0;
	        for(int i=0;i<H;i++)h[i][1]=i;
	        for(int i=0;i<W;i++)w[i][1]=i;
	        for(int i=0;i<M;i++) {
	        	int x =sc.nextInt()-1;
	        	int y =sc.nextInt()-1;
	        	m[x][y]=true;
	        	h[x][0]++;
	        	w[y][0]++;
	        }
	        Arrays.sort(h, (b, c) -> Integer.compare(b[0], c[0]));
	        Arrays.sort(w, (b, c) -> Integer.compare(b[0], c[0]));
	        for(int i=H-1;i>=0&&h[i][0]>=h[H-1][0]-1;i--) {
	        	for(int j=W-1;j>=0&&w[j][0]>=w[W-1][0]-1;j--) {
	        		int t=0;
	        		if(m[h[i][1]][w[j][1]]==true)t++;
	        		ans=Math.max(ans, h[i][0]+w[j][0]-t);
	        		
	        	}
	        }
	        System.out.println(ans);
		 }
		 
	}