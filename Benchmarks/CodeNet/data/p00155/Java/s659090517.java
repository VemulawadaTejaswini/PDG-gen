import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void dijkstra(int s,double cost[][],double d[],boolean used[],int V,int prev[],int end){
		ArrayList<Integer> cnt = new ArrayList<Integer>();
		for(int i = 0;i < V;i++){
			d[i] = Integer.MAX_VALUE;
			used[i] = false;
			prev[i] = -1;
		}
		d[s] = 0;
		while(true){
			int v = -1;
			for(int u = 0;u < V;u++){
				if(!used[u] && (v == -1 || d[u] < d[v]))v = u;
			}
			if(v == -1)break;
			used[v] = true;
			for(int u = 0;u < V;u++){
				if(d[v] != Integer.MAX_VALUE && cost[v][u] != Integer.MAX_VALUE){
					if(d[u] > d[v] + cost[v][u]){
						d[u] = d[v] + cost[v][u];
						prev[u] = v;
					}
				}
			}
		}
		int ans = end;
		if(end == s){
			System.out.println((s+1));
		}else if(prev[end] == -1){
			System.out.println("NA");
		}else{
			while(true){
				if(ans == s-1)break;
				if(ans == -1){
					System.out.println("NA");
				}
				ans = prev[ans];
				cnt.add(ans+1);
			}
			for(int i = cnt.size()-2;i >= 0;i--){
				System.out.print(cnt.get(i)+" ");
			}
			System.out.println((end+1));
		}
	}
	void doIt() { 
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			Point2D[] num = new Point2D[n];
			double[][] dis = new double [n][n];
			double[] d = new double [n];
			boolean[] used = new boolean[n];
			int[] prev = new int [n];
			for(int i = 0;i < n;i++){
				int a = sc.nextInt();
				num[a-1] = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
			}
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					if(Point2D.distance(num[i].getX(), num[i].getY(), num[j].getX(), num[j].getY()) <= 50){
						dis[i][j] = Point2D.distance(num[i].getX(), num[i].getY(), num[j].getX(), num[j].getY());
					}else{
						dis[i][j] = Integer.MAX_VALUE;
					}
				}
			}
			int m = sc.nextInt();
			for(int i = 0;i < m;i++){
				int start = sc.nextInt();
				int end = sc.nextInt();
				start = start - 1;
				end = end - 1;
				dijkstra(start,dis,d,used,n,prev,end);
			}
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}