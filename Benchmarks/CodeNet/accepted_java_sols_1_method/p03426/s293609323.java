	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int D = sc.nextInt();
	        int[][] a = new int[H*W][2];
	        for(int i=0;i<H;i++) {
	        	for(int j=0;j<W;j++) {
	        		int tmp=sc.nextInt()-1;
	        		a[tmp][0] = i;
	        		a[tmp][1] = j;
	        	}
	        }
	        
	        int[][] m = new int[D][(H*W)/D+1];
	        for(int i=0;i<D;i++) {
	        	for(int j=i+D;j<H*W;j=j+D) {
	        		m[i][j/D]=m[i][j/D-1]+Math.abs(a[j-D][0]-a[j][0])+Math.abs(a[j-D][1]-a[j][1]);
	        	}
	        }
	        
	        int Q = sc.nextInt();
	        StringBuffer ans= new StringBuffer();
	        for(int i=0;i<Q;i++) {
	        	int l = sc.nextInt()-1;
	        	int r = sc.nextInt()-1;
	        	int tmp = m[r%D][r/D]-m[l%D][l/D];
	        	ans.append(tmp);
	        	ans.append("\n");
	        }
	        
	        System.out.print(ans);
	    }
	}
