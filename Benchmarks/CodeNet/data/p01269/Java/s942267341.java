import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			int money = in.nextInt();
			if(n==0) break;
			int[][] e = new int[n][n];
			int[][] d = new int[n][n];
			Node[] node = new Node[n];
			for(int i=0; i<n; i++) node[i] = new Node(i);
			for(int i=0; i<m; i++){
				int a = in.nextInt()-1;
				int b = in.nextInt()-1;
				int dist = in.nextInt();
				int enemy = in.nextInt();
				d[a][b] = d[b][a] = dist;
				e[a][b] = e[b][a] = enemy;
				node[a].createEdge(node[b]);
				node[b].createEdge(node[a]);
			}
			Queue<Pos> qu = new PriorityQueue<Pos>();
			qu.add(new Pos(0, 0, money, 0, 1));
			boolean[][] used = new boolean[n][money+1];
			final int INF = 100000000;
			int res = INF;
			while(!qu.isEmpty()){
				Pos p = qu.poll();
				if(used[p.id][p.m]) continue;
				if(p.id == n-1){
					res = Math.min(p.e, res);
					continue;
				}
				used[p.id][p.m] = true;
				for(Node v: node[p.id].edge){
					if((p.state&1<<v.id)>0) continue;
					qu.add(new Pos(v.id, p.d+d[p.id][v.id], p.m, p.e+e[p.id][v.id], p.state|1<<v.id));
					if(p.m - d[p.id][v.id] < 0) continue;
					qu.add(new Pos(v.id, p.d+d[p.id][v.id], p.m-d[p.id][v.id], p.e, p.state|1<<v.id));
				}
			}
			System.out.println(res);
		}
	}
}

class Pos implements Comparable<Pos>{
	int id;
	int d, m, e;
	int state;
	public Pos(int id, int d, int m, int e, int state){
		this.id = id;
		this.d = d;
		this.m = m;
		this.e = e;
		this.state = state;
	}
	@Override
	public int compareTo(Pos o) {
		return e-o.e;
	}
}

class Node{
	int id;
	ArrayList<Node> edge = new ArrayList<Node>();
	public Node(int id){
		this.id = id;
	}
	public void createEdge(Node nd){
		edge.add(nd);
	}
}