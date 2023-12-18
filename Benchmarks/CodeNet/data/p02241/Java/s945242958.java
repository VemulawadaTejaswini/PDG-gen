import java.util.ArrayList;
import java.util.Scanner;

public class MST {
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Graph g = new Graph(num);
		for (int i=0;i<num;i++) {
			for (int m =0;m<num;m++) {
				int we = sc.nextInt();
				g.setEdge(i,m,we);
			}
		}
		//for (int i =0;i<g.getV();i++) {
		//	System.out.println(g.getAdj(i));
		//}
		System.out.println(g.getMst());
	}
	static class Graph{
		public Vertice[] ver;
		public int[][] matrix;
		public Graph(int n) {
			this.ver= new Vertice[n];
			for (int i=0;i<n;i++) {
				this.ver[i] = new Vertice(i);
			}
			this.matrix=new int[n][n];
		}
		
		public int getV() {
			return this.ver.length;
		}
		
		public void setEdge(int n,int m,int we) {
			this.matrix[n][m] = we;
		}
		
		public ArrayList<ArrayList<Integer>> getAdj(int n){
			ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
			int m = this.getV();
			for (int i=0;i<m;i++) {
				if (this.matrix[n][i] !=-1) {
					ArrayList<Integer> arr = new ArrayList<Integer>();
					arr.add(i);
					arr.add(this.matrix[n][i]);
					a.add(arr);
				}
			}
			return a;
		}
		
		public int getMinVe(ArrayList<Integer> arr) {
			int index = -1;
			int m=Integer.MAX_VALUE;
			for (int i=0;i<arr.size();i++) {
				if (this.ver[arr.get(i)].value<=m) {
					index = i;
					m = this.ver[arr.get(i)].value;
				}
			}
			return index;
		}
		
		public int getMst(){
			//ArrayList<int[]> al= new ArrayList<int[]>();
			int mindis =0;
			ArrayList<Integer> q = new ArrayList<Integer>();
			for (int i=0;i<this.getV();i++) {
				q.add(i);
			}
			this.ver[0].setValue(0);
			while (!q.isEmpty()) {
				//for (int i=0;i<this.getV();i++) {
				//	System.out.println(this.ver[i]);
				//}
				//System.out.println();
				int index = this.getMinVe(q);
				//System.out.println(index);
				int m = q.remove(index);
				this.ver[m].setVisit();
				if (this.ver[m].parent != -20) {
					int k =this.ver[m].parent;
					int l =this.ver[m].key;
					mindis = mindis + this.matrix[k][l];
				} 
				ArrayList<ArrayList<Integer>> arr = this.getAdj(m);
				for (int i=0;i<arr.size();i++) {
					int ve = arr.get(i).get(0);
					if (this.ver[ve].visit == 0) {
						int we = arr.get(i).get(1);
						if ((this.ver[m].value+we)<this.ver[ve].value) {
							this.ver[ve].setValue(we+this.ver[m].value);
							this.ver[ve].setParent(m);
						}
					}
				}
				
			}
			return mindis;
			
		}
	}
	
	static class Vertice{
		public int key;
		public int value;
		public int parent;
		public int visit;
		//@SuppressWarnings("null")
		public String toString() {
			return this.value +" "+ this.parent+" "+this.visit; 
		}
		public Vertice(int num) {
			this.key = num;
			this.value = Integer.MAX_VALUE;
			this.parent = -20;
			this.visit=0;
		}
		
		public void setValue(int k) {
			this.value =k;
		}
		
		public void setParent(int n) {
			this.parent =n;
		}
		
		public int getParent() {
			return this.parent;
		}
		public void setVisit() {
			this.visit = 1;
		}
	}
}
