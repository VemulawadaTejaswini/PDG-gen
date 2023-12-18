import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node[] inn = new Node[101];
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			if(n == 0 && m == 0 & l == 0){
				break;
			}
			for(int i = 1; i <= n; i++){
				inn[i] = new Node(i);
			}
			Node start = inn[1];
			Node goal = inn[n];
			for(int i = 0; i < m; i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int d = sc.nextInt();
				int e = sc.nextInt();
				
				inn[a].edges.add(new Edge(e, d, inn[b]));
				inn[b].edges.add(new Edge(e, d, inn[a]));
			}
			boolean[][] flg = new boolean[n + 1][n + 1];
			for(int i = 0; i <= n; i++){
				for(int j = 0; j <= n; j++){
					flg[i][j] = false;
				}
			}
			start.flg = true;
			System.out.println(func(start, l, goal, flg));
			
		}
		
		
		sc.close();
	}
	static int func(Node node, int cap, Node goal, boolean[][] flg){
		int res = 1000000000;
		if(node.equals(goal)){
			return 0;
		}		
		for(Edge e : node.edges){
			if(!flg[node.n][e.t.n]){
				flg[e.t.n][node.n] = true;
				if(e.d > cap){
					res = Math.min(res, func(e.t, cap, goal, flg) + e.e);
				}else{
					res = Math.min(res, Math.min(func(e.t, cap - e.d, goal, flg), func(e.t, cap, goal, flg) + e.e));
				}
			}
		}
		
		return res;
	}

}
class Node{
	int n;
	boolean flg;
	LinkedList<Edge> edges;
	Node(int number){
		edges = new LinkedList<Edge>();
		n = number;
		flg = false;
	}
}
class Edge{
	int e;
	int d;
	Node t;
	Edge(int enemy, int dist, Node to){
		e = enemy;
		d = dist;
		t = to;
	}
}