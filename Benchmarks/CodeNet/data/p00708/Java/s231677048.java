import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			double[] x = new double[n];
			double[] y = new double[n];
			double[] z = new double[n];
			double[] r = new double[n];
			for(int i=0;i<n;i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				z[i] = sc.nextDouble();
				r[i] = sc.nextDouble();
			}
			ArrayList<Edge> graph = new ArrayList<Edge>();
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					double dist = Math.sqrt((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i])+(z[j]-z[i])*(z[j]-z[i])) - r[i] - r[j];
					if (dist<0) {
						dist = 0;
					}
					graph.add(new Edge(dist,i,j));
				}
			}
			Collections.sort(graph);
			//System.out.println(graph.toString());

			UnionFind uf = new UnionFind(n);
			double ans = 0;
			int connected = 1;
			for(int i=0;i<graph.size();i++) {
				Edge e = graph.get(i);
				if (!uf.isConnected(e.from, e.to)) {
					uf.union(e.from, e.to);
					connected++;
					ans+=e.cost;
					if (connected==n) {
						break;
					}
				}
			}

			System.out.printf("%.3f\n", ans);
		}
	}

}
class Edge implements Comparable<Edge>{
	double cost;
	int from;
	int to;
	public Edge(double cost,int from,int to) {
		this.cost = cost;
		this.from = from;
		this.to = to;
	}
	@Override
	public int compareTo(Edge o) {
		if (this.cost == o.cost) {
			return 0;
		}else if(this.cost > o.cost) {
			return 1;
		}else{
			return -1;
		}
	}

	public String toString() {
		return this.cost + "," + this.from + "," + this.to;
	}
}

class UnionFind {
	private int[] data;
	public UnionFind(int size) {
		data = new int[size];
		Arrays.fill(data, -1);
	}
	public void union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			if (data[y] < data[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			data[x] += data[y];
			data[y] = x;
		}
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	private int root(int x) {
		return data[x] < 0 ? x : (data[x] = root(data[x]));
	}
	public int size(int x) {
		return -data[root(x)];
	}
	public String toString() {
		return Arrays.toString(data);
	}
}