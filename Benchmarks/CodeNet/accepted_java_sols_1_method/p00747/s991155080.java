import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			int[][] xw = new int[h][w-1];
			int[][] yw = new int[h-1][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w-1;j++) xw[i][j] = sc.nextInt();
				if(i==h-1) break;
				for(int j=0;j<w;j++) yw[i][j] = sc.nextInt();
			}
			
			int[][] cost = new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			
			LinkedList<Integer> x = new LinkedList<Integer>();
			LinkedList<Integer> y = new LinkedList<Integer>();
			x.offer(0);
			y.offer(0);
			cost[0][0] = 1;
			
			int p, q;
			while(x.size()!=0){
				p = x.poll();
				q = y.poll();
				if(p>0 && xw[q][p-1]==0 && cost[q][p]+1<cost[q][p-1]){
					cost[q][p-1] = cost[q][p]+1;
					x.offer(p-1);
					y.offer(q);
				}
				if(p<w-1 && xw[q][p]==0 && cost[q][p]+1<cost[q][p+1]){
					cost[q][p+1] = cost[q][p]+1;
					x.offer(p+1);
					y.offer(q);
				}
				if(q>0 && yw[q-1][p]==0 && cost[q][p]+1<cost[q-1][p]){
					cost[q-1][p] = cost[q][p]+1;
					x.offer(p);
					y.offer(q-1);
				}
				if(q<h-1 && yw[q][p]==0 && cost[q][p]+1<cost[q+1][p]){
					cost[q+1][p] = cost[q][p]+1;
					x.offer(p);
					y.offer(q+1);
				}
			}
			
			if(cost[h-1][w-1]==Integer.MAX_VALUE) System.out.println(0);
			else System.out.println(cost[h-1][w-1]);
		}	
	}	
}