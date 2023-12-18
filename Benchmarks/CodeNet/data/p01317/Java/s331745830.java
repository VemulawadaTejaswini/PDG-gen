import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Solve{
	final Scanner in = new Scanner(System.in);
	final static int INF = 10000000;
	boolean solve(){
		int n = in.nextInt();
		int m = in.nextInt();
//		Pos.n = n;
		if(n == 0) return false;
		int[][] land = new int[n][n];
		int[][] sea = new int[n][n];
//		Node[] node = new Node[n];
//		for(int i=0; i<n; i++) node[i] = new Node(i);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i==j) continue;
				land[i][j] = INF;
				sea[i][j] = INF;
			}
		}
		for(int i=0; i<m; i++){
			int x = in.nextInt()-1;
			int y = in.nextInt()-1;
			int t = in.nextInt();
			char sl = in.next().charAt(0);
//			node[x].createEdge(node[y]);
//			node[y].createEdge(node[x]);
			if(sl == 'L'){
				land[x][y] = land[y][x] = t;
			}else{
				sea[x][y] = sea[y][x] = t;
			}
		}
		int r = in.nextInt();
		int[] z = new int[r];
		for(int i=0; i<r; i++) z[i] = in.nextInt()-1;
		for(int k=0; k<n; k++)
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++){
					land[i][j] = Math.min(land[i][j], land[i][k]+land[k][j]);
					sea[i][j] = Math.min(sea[i][j], sea[i][k]+sea[k][j]);
				}
		
		int[][] dp = new int[r][n];
		for(int i=0; i<r; i++){
			for(int j=0; j<n; j++){
				dp[i][j] = INF;
			}
		}
		dp[0][z[0]] = 0;
		for(int i=0; i<r-1; i++){
			for(int j=0; j<n; j++){
				if(land[z[i]][z[i+1]] < INF)
					dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]+land[z[i]][z[i+1]]);
				for(int k=0; k<n; k++){
					if(land[z[i]][j] == INF
							|| sea[j][k] == INF
							|| land[k][z[i+1]] == INF) continue;
					dp[i+1][k] = Math.min(dp[i+1][k]
							, dp[i][j]+land[z[i]][j]+sea[j][k]+land[k][z[i+1]]);
				}
			}
		}
		int res = INF;
		for(int i=0; i<n; i++){
			res = Math.min(res, dp[r-1][i]);
		}
		
//		Queue<Pos> qu = new PriorityQueue<Pos>();
//		qu.add(new Pos(0, z[0], 0));
//		BitSet used = new BitSet(n*n);
//		int res = -1;
//		while(!qu.isEmpty()){
//			Pos p = qu.poll();
//			if(used.get(p.id)) continue;
//			if(p.z == r-1){
//				res = p.dist;
//				break;
//			}
//			used.set(p.id);
//			if(land[z[p.z]][z[p.z+1]] < INF){
//				qu.add(new Pos(p.z+1, p.boat, p.dist+land[z[p.z]][z[p.z+1]]));
//			}
//			for(int i=0; i<n; i++){
//				if(land[z[p.z]][p.boat] == INF
//						|| sea[p.boat][i] == INF
//						|| land[i][z[p.z+1]] == INF) continue;
//				qu.add(new Pos(p.z+1, i
//						, p.dist+land[z[p.z]][p.boat]+sea[p.boat][i]+land[i][z[p.z+1]]));
//			}
//		}
		System.out.println(res);
		return true;
	}
}
//
//class Pos implements Comparable<Pos>{
//	int z;
//	int boat;
//	int dist;
//	int id;
//	static int n;
//	Pos(int z, int boat, int dist){
//		this.z = z;
//		this.boat = boat;
//		this.dist = dist;
//		id = z*n + boat;
//	}
//	
//	@Override
//	public int compareTo(Pos o) {
//		return dist - o.dist;
//	}
//}
//
//class Node{
//	int id;
//	ArrayList<Node> edge = new ArrayList<Node>();
//	Node(int id){
//		this.id = id;
//	}
//	void createEdge(Node nd){
//		edge.add(nd);
//	}
//}

public class Main{
	public static void main(String[] args) throws IOException{
		Solve solve = new Solve();
		while(solve.solve());
	}
}