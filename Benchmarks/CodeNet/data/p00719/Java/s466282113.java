import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int V = m * (1<<n);
			if(n==0) {
				break;
			}
			int[] t = new int[n];
			for(int i=0;i<n;i++) {
				t[i] = sc.nextInt();
			}
			
			Node[] graph = new Node[V];
			for(int i=0;i<V;i++) {
				graph[i] = new Node();
			}
			for(int i=0;i<p;i++) {
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				double z = sc.nextInt();
				for(int j=1;j<(1<<n);j++) {
					for(int k=0;k<n;k++) {
						if ((j&(1<<k)) > 0) {
							int to = j^(1<<k);
							graph[x+m*j].to.add(y+m*to);
							graph[x+m*j].cost.add(z/t[k]);
							
							graph[y+m*j].to.add(x+m*to);
							graph[y+m*j].cost.add(z/t[k]);
						}
					}
				}
			}
			
			int s = a+m*((1<<n)-1);
			graph[s].costmin = 0;
			PriorityQueue<Node> q = new PriorityQueue<Node>();
			q.offer(graph[s]);

			while(!q.isEmpty()) {
				Node doneNode = q.poll();

				doneNode.done = true;

				for(int i=0;i<doneNode.cost.size();i++) {
					int to = doneNode.to.get(i);
					double cost = doneNode.costmin + doneNode.cost.get(i);
					if (graph[to].costmin < 0 || cost < graph[to].costmin) {
						graph[to].costmin = cost;
						if(!q.contains(graph[to])) {
							q.offer(graph[to]);
						}
					}
				}
			}

			double ans = Double.POSITIVE_INFINITY;
			for(int i=0;i<(1<<n);i++) {
				double cost = graph[b+m*i].costmin > 0 ? graph[b+m*i].costmin : Double.POSITIVE_INFINITY;
				ans = Math.min(ans, cost);
			}
			System.out.println(ans);
		}
	}

}
class Node implements Comparable<Node>{
	ArrayList<Integer> to = new ArrayList<Integer>();
	ArrayList<Double> cost = new ArrayList<Double>();
	boolean done = false;
	double costmin = -1;

	public int compareTo(Node o) {
		return Double.compare(this.costmin,o.costmin);
	}

}