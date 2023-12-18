import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Graph g= new Graph(a);
		int b = sc.nextInt();
		//System.out.println(b);
		for (int i =0;i<b;i++) {
			g.setEdge(sc.nextInt(), sc.nextInt());
		}
		//g.display();
		int c = sc.nextInt();
		//System.out.println(c);
		for (int j =0;j<c;j++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			String reach = g.Reachiable(m, n);
			g.reset();
			//if (reach.equals("no") && g.Reachiable(n, m).equals("yes")) {
			//	System.out.println("yes");
			//}
			//else {
			System.out.println(reach);
			//}
		}
		sc.close();
	}
	static class Graph {
		public String[] mark;
		private int numEdge;
		private int[][] matrix;
		public Graph(int n) {
			this.matrix = new int[n][n];
			this.numEdge =0;
			this.mark =new String[n];
			for (int i=0;i<n;i++) {
				this.mark[i]="u";
			}
		}
		
		public int v() {
			return this.matrix.length;
		}
		
		public int e() {
			return this.numEdge;
		}
		
		public void setEdge(int i,int j) {
			this.matrix[i][j]=1;
			this.matrix[j][i]=1;
			this.numEdge++;
		}

		public void delEdge(int i,int j) {
			this.matrix[i][j]=0;
			this.numEdge--;
		}
		
		public void setVisit(int ve) {
			this.mark[ve]="v";
		}
		
		public String getVisit(int ve) {
			return this.mark[ve];
		}
		
		public void reset() {
			for (int i=0;i<this.v();i++) {
				this.mark[i]="u";
			}
			
		}
		
		public ArrayList<Integer> getAdjecent(int ve){
			ArrayList<Integer> adj = new ArrayList<Integer>();
			for (int i =0;i<this.v();i++) {
				if (this.matrix[ve][i]==1) {
					adj.add(i);
				}
			}
			return adj;
		}
		public void display() {
			System.out.print(" ");
			for (int i=0; i<this.v();i++) {
				System.out.print(" "+(i));
			}
			System.out.println();
			for (int i=0;i<this.v();i++) {
				System.out.print((i)+" ");
				for (int j=0;j<this.v();j++) {
					System.out.print(this.matrix[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		public String Reachiable(int v1,int v2) {
			if (this.getAdjecent(v1).isEmpty()) {
				return "no";
			}
			else {
				this.setVisit(v1);
				if (this.getAdjecent(v1).contains(v2)) {
					return "yes";
				}
				else {
					for (int i: this.getAdjecent(v1)) {
						if (this.getVisit(i).equals("u")) {
							String k =Reachiable(i,v2);
						    if (k.equals("yes")) {
						    	return "yes";
						    }
						 }
					}
					return "no";
				}
			}
		}
	}
}
