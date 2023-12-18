import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N;

		N = scanner.nextInt();

		int[] min_dist = new int[N];
		Node[] nodes = new Node[N];
		for(int i = 0; i < N; i++)nodes[i] = new Node();

		int node_id,num,to,dist;

		for(int loop = 0; loop < N; loop++){
			node_id = scanner.nextInt();
			num = scanner.nextInt();

			for(int i = 0; i < num; i++){
				to = scanner.nextInt();
				dist = scanner.nextInt();
				nodes[node_id].ADJ.add(new Edge(to,dist));
			}
		}

		min_dist[0] = 0;
		for(int i = 1; i < N; i++)min_dist[i] = BIG_NUM;

		PriorityQueue<Info> Q = new PriorityQueue<Info>();
		int next_node,next_dist;

		Q.add(new Info(0,0));

		while(!Q.isEmpty()){

			if(Q.peek().sum_dist > min_dist[Q.peek().node_id]){
				Q.remove();
			}else{

				for(int i = 0; i < nodes[Q.peek().node_id].ADJ.size(); i++){
					next_node = nodes[Q.peek().node_id].ADJ.get(i).to;
					next_dist = Q.peek().sum_dist+nodes[Q.peek().node_id].ADJ.get(i).dist;

					if(min_dist[next_node] > next_dist){
						min_dist[next_node] = next_dist;
						Q.add(new Info(next_node,next_dist));
					}
				}
				Q.remove();
			}
		}

		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < N; i++){
			System.out.println(i + " " + min_dist[i]);
		}

		System.out.print(ans.toString());
	}
}

class Node{
	public ArrayList<Edge> ADJ;

	Node(){
		ADJ = new ArrayList<Edge>();
	}
}

class Edge{
	public int to;
	public int dist;

	Edge(int arg_to,int arg_dist){
		to = arg_to;
		dist = arg_dist;
	}
}

class Info implements Comparable<Info>{
	public int node_id;
	public int sum_dist;

	Info(int arg_node_id,int arg_sum_dist){
		this.node_id = arg_node_id;
		this.sum_dist = arg_sum_dist;
	}

	public int compareTo(Info arg){
		if(this.sum_dist < arg.sum_dist)return -1;
		if(this.sum_dist > arg.sum_dist)return 1;
		return 0;
	}
}


