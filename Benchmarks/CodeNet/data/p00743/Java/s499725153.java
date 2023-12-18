import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
//		int idx = 0;
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n == 0) break;
			int s = in.nextInt()-1;
			int g = in.nextInt()-1;
			boolean[][][] used = new boolean[n][n][31];
			int[][] rist = new int[n][n];
			int[][] dist = new int[n][n];
			Node[] node = new Node[n];
			for(int i=0; i<n; i++) node[i] = new Node(i);
			for(int i=0; i<m; i++){
				int x = in.nextInt()-1;
				int y = in.nextInt()-1;
				int d = in.nextInt();
				int c = in.nextInt();
				node[x].createEdge(node[y]);
				node[y].createEdge(node[x]);
				dist[x][y] = dist[y][x] = d;
				rist[x][y] = rist[y][x] = c;
			}
//			double[][][] best = new double[n][n][31];
			Queue<Pos> qu = new PriorityQueue<Pos>();
			qu.add(new Pos(s, s, 0, 0));
			double time = 1e9;
			while(!qu.isEmpty()){
				Pos p = qu.poll();
				if(p.city == g && p.vel == 1){
					time = p.dist;
					break;
//					time = Math.min(time, p.dist);
				}
//				if(best[p.city][p.back][p.vel] != 0
//						&& best[p.city][p.back][p.vel] <= p.dist) continue;
//				best[p.city][p.back][p.vel] = p.dist;
				if(used[p.city][p.back][p.vel]) continue;
				used[p.city][p.back][p.vel] = true;
				for(Node nd: node[p.city].list){
					if(p.back == nd.id) continue;
					for(int i=-1; i<=1; i++){
						int v = p.vel+i;
						if(v < 1 || v > rist[p.city][nd.id]) continue;
						qu.add(new Pos(nd.id, p.city, v, p.dist + (double)dist[p.city][nd.id]/v));
					}
				}
			}
			System.out.println(time >= 1e9 ? "unreachable" : time);
//			idx++;
		}
	}
}

class Node{
	int id;
	List<Node> list = new ArrayList<Node>();
	public Node(int id){
		this.id = id;
	}
	
	public void createEdge(Node nd){
		list.add(nd);
	}
}

class Pos implements Comparable<Pos>{
	int city;
	int back;
	int vel;
	double dist;
	public Pos(int c, int back, int v, double dist){
		city = c;
		vel = v;
		this.back = back;
		this.dist = dist;
	}
	
	@Override
	public int compareTo(Pos o) {
		return Double.compare(dist, o.dist);
	}
}