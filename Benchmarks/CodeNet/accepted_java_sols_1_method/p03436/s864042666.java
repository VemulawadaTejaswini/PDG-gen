import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static long[] kaijo;
	 static long[] kaiinv;
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();	
	        int W = sc.nextInt();
	        char[][] c = new char[H][W];
	        int[][] m = new int[H][W];
	        int cnt=0;
	        for(int i=0;i<H;i++) {
	        	String tmp = sc.next();
	        	c[i]=tmp.toCharArray();
	        	for(int j=0;j<W;j++) {
	        		if(c[i][j]=='#') {
	        			m[i][j]=-1;
	        			cnt++;
	        		}
	        	}
	        }
			LinkedList<Integer> queue = new LinkedList<Integer>();
			m[0][0]=1;
			queue.add(0);
			queue.add(0);
			queue.add(1);
			while(!queue.isEmpty()) {
				int h = queue.poll();
				int w = queue.poll();
				int d = queue.poll();
				if(h!=0&&m[h-1][w]==0) {
					m[h-1][w]=d+1;
					queue.add(h-1);
					queue.add(w);
					queue.add(d+1);
				}
				if(h!=H-1&&m[h+1][w]==0) {
					m[h+1][w]=d+1;
					queue.add(h+1);
					queue.add(w);
					queue.add(d+1);
				}
				if(w!=0&&m[h][w-1]==0) {
					m[h][w-1]=d+1;
					queue.add(h);
					queue.add(w-1);
					queue.add(d+1);
				}
				if(w!=W-1&&m[h][w+1]==0) {
					m[h][w+1]=d+1;
					queue.add(h);
					queue.add(w+1);
					queue.add(d+1);
				}
			}
	        if(m[H-1][W-1]==0){
	        	System.out.println(-1);
	        	return;
	        }
	        System.out.println(W*H-cnt-m[H-1][W-1]);
	        
	        
	 }

}