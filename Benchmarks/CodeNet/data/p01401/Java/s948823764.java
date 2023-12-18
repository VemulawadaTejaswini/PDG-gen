import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			LinkedList<Node> list = new LinkedList<Node>();
			Node goal = null, start = null;
			for(int i = 0; i < w; i++){
				for(int j = 0; j < h; j++){
					String s = sc.next();
					if(s.equals("S")){
						Node n = new Node();
						n.dist = 0;
						n.x = i;
						n.y = j;
						n.n = 0;
						list.add(n);
						start = n;
					}else if(s.equals("G")){
						Node n = new Node();
						n.dist = 20000;
						n.x = i;
						n.y = j;
						n.n = 100;
						goal = n;
					}else{
						if(s.matches("[0-9]+")){
							Node n = new Node();
							n.dist = 20000;
							n.x = i;
							n.y = j;
							n.n = Integer.parseInt(s);
							list.add(n);
						}
					}
				}
			}
			for(int i = 0; i < list.size(); i++){
				boolean flg = false;
				Node from = list.get(i);
				for(int j = 0; j < list.size(); j++){
					Node to = list.get(j);
					if(to.n == from.n + 1){
						Edge e = new Edge();
						e.cost = Math.abs(to.x - from.x) + Math.abs(to.y - from.y);
						e.to = to;
						from.edges.add(e);
						flg = true;
					}
				}
				if(!flg){
					Edge e = new Edge();
					e.cost = Math.abs(from.x - goal.x) + Math.abs(from.y - goal.y);
					e.to = goal;
					from.edges.add(e);
				}
			}
			PriorityQueue<Node> q = new PriorityQueue<Node>();
			q.add(start);
			while(!q.isEmpty()){
				Node n = q.poll();
				if(n.equals(goal)){
					break;
				}
				for(Edge e : n.edges){
					if(e.to.dist > e.cost + n.dist){
						e.to.dist = e.cost + n.dist;
						q.add(e.to);
					}
				}
			}
			System.out.println(goal.dist);
		}
		
		
		
		sc.close();
	}
}
class Edge{
	int cost;
	Node to;
}
class Node implements Comparable<Node>{
	int n;
	int x;
	int y;

	int dist;
	LinkedList<Edge> edges;
	Node(){
		edges = new LinkedList<Edge>();
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return dist - o.dist;
	}
}