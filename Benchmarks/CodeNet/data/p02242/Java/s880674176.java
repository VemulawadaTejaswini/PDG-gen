import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Graph g = new Graph(n);
		for (int i=0;i<n;i++) {
			sc.nextInt();
			int k = sc.nextInt();
			for (int j=0;j<k;j++) {
				int v = sc.nextInt();
				int w = sc.nextInt();
				g.node[i].setEdge(v, w);
			}
		}
		//g.display();
		sc.close();
		g.getPath();
	}
	static class Graph{
		public Vertice[] node;
		public int[] sArr;
		public ArrayList<Integer> index;
		public Graph(int n) {
			node = new Vertice[n];
			for (int i =0;i<n;i++) {
				node[i] = new Vertice(i);
			}
			sArr= new int[n];
			sArr[0] = 0;
			for (int i=1;i<n;i++) {
				sArr[i] = Integer.MAX_VALUE;
			}
			index =new ArrayList<Integer>();
		}
		
		public void display() {
			for (Vertice ve:node) {
				System.out.println(ve);
			}
		}
		
		public int v() {
			return this.node.length;
		}
		
		public Vertice ve(int n) {
			return this.node[n];
		}
		
		public void getPath() {
			ArrayList<Vertice> q = new ArrayList<Vertice>();
			//System.out.println(Arrays.toString(sArr));
			q.add(this.ve(0));
			while (!q.isEmpty()) {
				//System.out.println(Arrays.toString(sArr));
				int minIndex = MinIndex(sArr,index);
				index.add(minIndex);
				//System.out.println(minIndex);
				int index=-1;
				for (int i =0;i<q.size();i++) {
					if (q.get(i).id ==minIndex) {
						index = i;
						break;
					}
				}
				int i = q.remove(index).id;
				this.node[i].setVisit();
				Vertice ver = this.node[i];
				ArrayList<Integer> arr = ver.getAdj();
				for (int j=0;j<arr.size();j++) {
					int a = arr.get(j);
					if (!this.node[a].visit) {
						if (!q.contains(this.node[a])) {
							q.add(this.node[a]);
						    sArr[a] = sArr[i]+ ver.edge.get(j).getW();
						}
						else {
							sArr[a] =min(sArr[a], sArr[i]+ ver.edge.get(j).getW());
						}
					}
				}
			}
			for (int i=0;i<this.node.length;i++) {
				System.out.print(i+" "+sArr[i]);
				System.out.println();
			}
		}
		
	}
	public static int min(int a,int b) {
		if (a>=b) {
			return b;
		}
		else {
			return a;
		}
	}
	public static int MinIndex(int[] a,ArrayList<Integer> al) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i=0;i<a.length;i++) {
			if (a[i]<=min && !al.contains(i)) {
				min = a[i];
				index =i;
			}
		}
		return index;
	}
	static class Vertice{
		private int id;
		private boolean visit;
		private ArrayList<Edge> edge;
		//private int[] weight;
		public String toString() {
			return "{"+ id + ","+visit+"," +edge +"}";
		}
		public Vertice(int n) {
			id = n;
			visit = false;
			edge = new ArrayList<Edge>();
			//weight= new int[]
		}
		
		public void setVisit() {
			this.visit =true;
		}
		public void setEdge(int n, int we) {
			Edge e = new Edge(n,we);
			edge.add(e);
		}
		
		public ArrayList<Integer> getAdj(){
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int i=0; i<this.edge.size();i++) {
				a.add(this.edge.get(i).getT());
			}
			return a;
		}
	}
	
	
	static class Edge{
		private int target;
		private int weight;
		public Edge(int n,int we) {
			target =n;
			weight=we;
		}
		public String toString() {
			return this.target+" "+this.weight;
		}
		public int getT() {
			return this.target;
		}
		public int getW() {
			return this.weight;
		}
	}

}
